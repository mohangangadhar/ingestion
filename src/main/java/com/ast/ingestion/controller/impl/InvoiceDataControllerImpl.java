package com.ast.ingestion.controller.impl;

import com.ast.ingestion.controller.InvoiceDataController;
import com.ast.ingestion.dto.InvoiceDataDTO;
import com.ast.ingestion.entity.InvoiceData;
import com.ast.ingestion.mapper.InvoiceDataMapper;
import com.ast.ingestion.service.InvoiceDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/api/invoice-data")
@RestController
public class InvoiceDataControllerImpl implements InvoiceDataController {
    private final InvoiceDataService invoiceDataService;
    private final InvoiceDataMapper invoiceDataMapper;

    public InvoiceDataControllerImpl(InvoiceDataService invoiceDataService, InvoiceDataMapper invoiceDataMapper) {
        this.invoiceDataService = invoiceDataService;
        this.invoiceDataMapper = invoiceDataMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InvoiceDataDTO save(@RequestBody InvoiceDataDTO invoiceDataDTO) {
        InvoiceData invoiceData = invoiceDataMapper.asEntity(invoiceDataDTO);
        return invoiceDataMapper.asDTO(invoiceDataService.save(invoiceData));
    }

    @Override
    @GetMapping("/{id}")
    public InvoiceDataDTO findById(@PathVariable("id") Integer id) {
        InvoiceData invoiceData = invoiceDataService.findById(id).orElse(null);
        return invoiceDataMapper.asDTO(invoiceData);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        invoiceDataService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<InvoiceDataDTO> list() {
        return invoiceDataMapper.asDTOList(invoiceDataService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<InvoiceDataDTO> pageQuery(Pageable pageable) {
        Page<InvoiceData> invoiceDataPage = invoiceDataService.findAll(pageable);
        List<InvoiceDataDTO> dtoList = invoiceDataPage
                .stream()
                .map(invoiceDataMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, invoiceDataPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public InvoiceDataDTO update(@RequestBody InvoiceDataDTO invoiceDataDTO, @PathVariable("id") Integer id) {
        InvoiceData invoiceData = invoiceDataMapper.asEntity(invoiceDataDTO);
        return invoiceDataMapper.asDTO(invoiceDataService.update(invoiceData, id));
    }


    @PostMapping("/upload/csv")
    public void uploadCsvBatch(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            System.out.println("There needs to be a file to upload!");
        } else {
            invoiceDataService.processCsv(file);
        }
    }
}