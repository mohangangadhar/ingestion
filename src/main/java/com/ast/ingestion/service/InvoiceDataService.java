package com.ast.ingestion.service;

import com.ast.ingestion.entity.InvoiceData;
import org.springframework.web.multipart.MultipartFile;

public interface InvoiceDataService extends GenericService<InvoiceData, Integer> {

    void processCsv(MultipartFile file);

}