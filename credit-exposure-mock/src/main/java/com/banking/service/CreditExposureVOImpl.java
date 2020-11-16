package com.banking.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.banking.VO.CustomerVO;
import com.banking.VO.SectorVO;
import com.banking.entity.FinancialDtl;
import com.banking.entity.Sector;
import com.banking.exception.BankingException;
import com.banking.mapper.CreditExposureMapper;
import com.banking.repository.FinancialRepository;
import com.banking.repository.SectorRepository;

@Service
public class CreditExposureVOImpl implements CreditExposureService {

	@Autowired
	private SectorRepository sectorRepository;

	@Autowired
	private FinancialRepository financialRepository;

	@Autowired
	private CreditExposureMapper mapper;

	@Override
	public List<SectorVO> findAllSectors(Integer topCount) throws BankingException {
		List<SectorVO> response = new ArrayList<>();

		List<Sector> allsector = sectorRepository.findAll();
		if (!ObjectUtils.isEmpty(allsector)) {
			response = mapper.mapSectors(allsector, topCount);

		} else
			System.out.println("No data for credit exposure found.");

		return response;
	}

	@Override
	public List<CustomerVO> findAllCustomers(Integer sectorId) throws BankingException {
		List<CustomerVO> response = new ArrayList<>();

		List<String> customers = financialRepository.findAllCustomerBySectorId(sectorId);
		if (!ObjectUtils.isEmpty(customers)) {
			response = mapper.mapCustomer(customers);

		} else
			System.out.println("No customer found.");

		return response;
	}

	@Override
	public List<CustomerVO> findAllExposure(Integer sectorId) throws BankingException {
		List<CustomerVO> response = new ArrayList<>();

		List<Sector> sector = sectorRepository.findAllExposureBySectorId(sectorId);
		if (!ObjectUtils.isEmpty(sector)) {
			response = mapper.mapExposure(sector);

		} else
			System.out.println("No customer found.");

		return response;
	}

	@Override
	public Set<String> findAllFacilities(Integer sectorId) throws BankingException {
		Set<String> response = new HashSet<>();

		List<FinancialDtl> financeDtl = financialRepository.findAllFacilitiesBySectorId(sectorId);
		if (!ObjectUtils.isEmpty(financeDtl)) {
			response = mapper.mapFacilities(financeDtl);

		} else
			System.out.println("No customer found.");

		return response;
	}

}
