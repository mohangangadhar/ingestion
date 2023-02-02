package com.ast.ingestion.controller;

import com.ast.ingestion.dto.FinalAuditDataDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface FinalAuditDataController {
    public FinalAuditDataDTO save(@RequestBody FinalAuditDataDTO finalAuditData);

    public FinalAuditDataDTO findById(@PathVariable("id") Integer id);

    public void delete(@PathVariable("id") Integer id);

    public List<FinalAuditDataDTO> list();

    public Page<FinalAuditDataDTO> pageQuery(Pageable pageable);

    public FinalAuditDataDTO update(@RequestBody FinalAuditDataDTO dto, @PathVariable("id") Integer id);
}