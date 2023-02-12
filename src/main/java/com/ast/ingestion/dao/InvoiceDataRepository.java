package com.ast.ingestion.dao;

import com.ast.ingestion.entity.InvoiceData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceDataRepository extends PagingAndSortingRepository<InvoiceData, Integer>,
        CrudRepository<InvoiceData, Integer>, JpaRepository<InvoiceData, Integer> {
}