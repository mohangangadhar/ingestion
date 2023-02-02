package com.ast.ingestion.mapper;

import com.ast.ingestion.dto.FinalAuditDataDTO;
import com.ast.ingestion.entity.FinalAuditData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ReferenceMapper.class)
public interface FinalAuditDataMapper extends GenericMapper<FinalAuditData, FinalAuditDataDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    FinalAuditData asEntity(FinalAuditDataDTO dto);
}