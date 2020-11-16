package com.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.entity.FinancialDtl;

@Repository
public interface FinancialRepository extends JpaRepository<FinancialDtl, Integer> {

	@Query("SELECT p.customerName FROM FinancialDtl p  WHERE p.sectorId = :sectorId")
	List<String> findAllCustomerBySectorId(@Param(value = "sectorId") Integer sectorId);

	@Query("SELECT p FROM FinancialDtl p JOIN FETCH p.sector JOIN FETCH p.facilities WHERE p.sectorId = :sectorId")
	List<FinancialDtl> findAllFacilitiesBySectorId(@Param(value = "sectorId") Integer sectorId);

}
