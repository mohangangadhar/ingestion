package com.ast.ingestion.mapper;

import com.ast.ingestion.dto.InvoiceDataDTO;
import com.ast.ingestion.entity.InvoiceData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ReferenceMapper.class)
public interface InvoiceDataMapper extends GenericMapper<InvoiceData, InvoiceDataDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    InvoiceData asEntity(InvoiceDataDTO dto);
}