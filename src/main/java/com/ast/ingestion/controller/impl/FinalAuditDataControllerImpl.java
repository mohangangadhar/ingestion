package com.ast.ingestion.controller.impl;

import com.ast.ingestion.controller.FinalAuditDataController;
import com.ast.ingestion.dto.FinalAuditDataDTO;
import com.ast.ingestion.entity.FinalAuditData;
import com.ast.ingestion.mapper.FinalAuditDataMapper;
import com.ast.ingestion.service.FinalAuditDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/api/final-audit-data")
@RestController
public class FinalAuditDataControllerImpl implements FinalAuditDataController {
    private final FinalAuditDataService finalAuditDataService;
    private final FinalAuditDataMapper finalAuditDataMapper;

    public FinalAuditDataControllerImpl(FinalAuditDataService finalAuditDataService, FinalAuditDataMapper finalAuditDataMapper) {
        this.finalAuditDataService = finalAuditDataService;
        this.finalAuditDataMapper = finalAuditDataMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FinalAuditDataDTO save(@RequestBody FinalAuditDataDTO finalAuditDataDTO) {
        FinalAuditData finalAuditData = finalAuditDataMapper.asEntity(finalAuditDataDTO);
        return finalAuditDataMapper.asDTO(finalAuditDataService.save(finalAuditData));
    }

    @Override
    @GetMapping("/{id}")
    public FinalAuditDataDTO findById(@PathVariable("id") Integer id) {
        FinalAuditData finalAuditData = finalAuditDataService.findById(id).orElse(null);
        return finalAuditDataMapper.asDTO(finalAuditData);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        finalAuditDataService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<FinalAuditDataDTO> list() {
        return finalAuditDataMapper.asDTOList(finalAuditDataService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<FinalAuditDataDTO> pageQuery(Pageable pageable) {
        Page<FinalAuditData> finalAuditDataPage = finalAuditDataService.findAll(pageable);
        List<FinalAuditDataDTO> dtoList = finalAuditDataPage
                .stream()
                .map(finalAuditDataMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, finalAuditDataPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public FinalAuditDataDTO update(@RequestBody FinalAuditDataDTO finalAuditDataDTO, @PathVariable("id") Integer id) {
        FinalAuditData finalAuditData = finalAuditDataMapper.asEntity(finalAuditDataDTO);
        return finalAuditDataMapper.asDTO(finalAuditDataService.update(finalAuditData, id));
    }

    @PostMapping("/upload/csv")
    public void uploadCsvBatch(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            System.out.println("There needs to be a file to upload!");
        } else {
            finalAuditDataService.processCsv(file);
        }
        // FinalAuditData finalAuditData = finalAuditDataMapper.asEntity(finalAuditDataDTO);
        //return finalAuditDataMapper.asDTO(finalAuditDataService.update(finalAuditData, id));
    }

}