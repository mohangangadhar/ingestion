package com.ast.ingestion.service;

import com.ast.ingestion.entity.FinalAuditData;
import org.springframework.web.multipart.MultipartFile;

public interface FinalAuditDataService extends GenericService<FinalAuditData, Integer> {
    void processCsv(MultipartFile file);

}