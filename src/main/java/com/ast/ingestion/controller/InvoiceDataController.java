package com.ast.ingestion.controller;

import com.ast.ingestion.dto.InvoiceDataDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface InvoiceDataController {
    public InvoiceDataDTO save(@RequestBody InvoiceDataDTO invoiceData);

    public InvoiceDataDTO findById(@PathVariable("id") Integer id);

    public void delete(@PathVariable("id") Integer id);

    public List<InvoiceDataDTO> list();

    public Page<InvoiceDataDTO> pageQuery(Pageable pageable);

    public InvoiceDataDTO update(@RequestBody InvoiceDataDTO dto, @PathVariable("id") Integer id);
}