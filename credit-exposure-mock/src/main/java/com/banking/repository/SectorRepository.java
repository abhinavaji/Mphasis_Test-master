package com.banking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.entity.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Integer> {

	@Query("SELECT p FROM Sector p WHERE p.id = :sectorId")
	List<Sector> findAllExposureBySectorId(@Param(value = "sectorId") Integer sectorId);

}
