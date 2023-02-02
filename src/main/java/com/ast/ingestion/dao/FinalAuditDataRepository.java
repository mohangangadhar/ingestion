package com.ast.ingestion.dao;

import com.ast.ingestion.entity.FinalAuditData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalAuditDataRepository extends PagingAndSortingRepository<FinalAuditData, Integer>,
        CrudRepository<FinalAuditData, Integer>, JpaRepository<FinalAuditData, Integer> {
}