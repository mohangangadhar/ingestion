package com.ast.ingestion.service.impl;

import com.ast.ingestion.dao.FinalAuditDataRepository;
import com.ast.ingestion.entity.FinalAuditData;
import com.ast.ingestion.service.FinalAuditDataService;
import com.google.common.collect.Lists;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@Transactional
public class FinalAuditDataServiceImpl implements FinalAuditDataService {
    private final FinalAuditDataRepository repository;

    public FinalAuditDataServiceImpl(FinalAuditDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public FinalAuditData save(FinalAuditData entity) {
        return repository.save(entity);
    }

    @Override
    public List<FinalAuditData> save(List<FinalAuditData> entities) {
        return (List<FinalAuditData>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<FinalAuditData> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<FinalAuditData> findAll() {
        return (List<FinalAuditData>) repository.findAll();
    }

    @Override
    public Page<FinalAuditData> findAll(Pageable pageable) {
        Page<FinalAuditData> entityPage = repository.findAll(pageable);
        List<FinalAuditData> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public FinalAuditData update(FinalAuditData entity, Integer id) {
        Optional<FinalAuditData> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }

    @Override
    public void processCsv(MultipartFile file) {
        try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {

            // create csv bean reader
            CsvToBean<FinalAuditData> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(FinalAuditData.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            AtomicInteger index = new AtomicInteger();
            // convert `CsvToBean` object to list of users
            List<FinalAuditData> records = csvToBean.parse();
            System.out.println("Total Records in File " + records.size());

            final List<List<FinalAuditData>> splittedList = Lists.partition(records, 10000);
            splittedList.forEach((rec) -> {
                        index.set(index.get() + 10000);

                        repository.saveAllAndFlush(rec);
                        repository.flush();
                        if (records.size() < index.get()) {
                            System.out.println("Processed records so far :" + index.get());
                        } else {
                            System.out.println("Processed records so far :" + records.size());
                        }
                    }
            );
            System.out.println("Done !, Enjoy querying ... ");
            // save users list on model
        } catch (Exception ex) {
            System.out.println("Boy!, you screwed up !");
        }

    }
}