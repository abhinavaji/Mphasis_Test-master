package com.banking.service;

import java.util.List;
import java.util.Set;

import com.banking.VO.CustomerVO;
import com.banking.VO.SectorVO;
import com.banking.exception.BankingException;

public interface CreditExposureService {
	List<SectorVO> findAllSectors(Integer topCount) throws BankingException;

	List<CustomerVO> findAllCustomers(Integer sectorId) throws BankingException;

	List<CustomerVO> findAllExposure(Integer sectorId) throws BankingException;

	Set<String> findAllFacilities(Integer sectorId) throws BankingException;
}
