package com.ast.ingestion.service.impl;

import com.ast.ingestion.dao.InvoiceDataRepository;
import com.ast.ingestion.dto.InvoiceDataDTO;
import com.ast.ingestion.entity.InvoiceData;
import com.ast.ingestion.mapper.InvoiceDataMapper;
import com.ast.ingestion.service.InvoiceDataService;
import com.google.common.collect.Lists;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.mapstruct.factory.Mappers;
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
public class InvoiceDataServiceImpl implements InvoiceDataService {
    private final InvoiceDataRepository repository;

    public InvoiceDataServiceImpl(InvoiceDataRepository repository) {
        this.repository = repository;
    }

    @Override
    public InvoiceData save(InvoiceData entity) {
        return repository.save(entity);
    }

    @Override
    public List<InvoiceData> save(List<InvoiceData> entities) {
        return (List<InvoiceData>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<InvoiceData> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<InvoiceData> findAll() {
        return (List<InvoiceData>) repository.findAll();
    }

    @Override
    public Page<InvoiceData> findAll(Pageable pageable) {
        Page<InvoiceData> entityPage = repository.findAll(pageable);
        List<InvoiceData> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public InvoiceData update(InvoiceData entity, Integer id) {
        Optional<InvoiceData> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }

    @Override
    public void processCsv(MultipartFile file) {
        try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            // create csv bean reader
            CsvToBean<InvoiceData> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(InvoiceData.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            AtomicInteger index = new AtomicInteger();
            // convert `CsvToBean` object to list of users
            List<InvoiceData> records = csvToBean.parse();
            System.out.println("Total Records in File " + records.size());

            final List<List<InvoiceData>> splittedList = Lists.partition(records, 10000);
            splittedList.forEach((rec) -> {
                        index.set(index.get() + 10000);
                        repository.saveAllAndFlush(rec);
                        repository.flush();
                        System.out.println("Processed records so far :" + index.get());
                    }
            );
            System.out.println("Done !, Enjoy querying ... ");
        } catch (Exception ex) {
            System.out.println("Boy!, you screwed up !");
        }
    }
}