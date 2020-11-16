package com.banking.mapper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.banking.VO.CustomerVO;
import com.banking.VO.SectorVO;
import com.banking.entity.FinancialDtl;
import com.banking.entity.Sector;

@Component
public class CreditExposureMapper {

	public List<SectorVO> mapSectors(List<Sector> allsector, Integer topCount) {
		List<SectorVO> sectorVOs = new ArrayList<>();

		allsector.forEach(sector -> {
			SectorVO sectorVO = new SectorVO();
			sectorVO.setSectorId(sector.getId());
			sectorVO.setSectorName(sector.getName());
			sectorVO.setTotalExposure(setTotalExposure(sector.getFinancialDtl()));
			sectorVO.setTotalCustomers(setTotalCustomerCount(sector.getFinancialDtl()));
			sectorVOs.add(sectorVO);
		});

		return sectorVOs.stream().sorted((s1, s2) -> s2.getTotalExposure().compareTo(s1.getTotalExposure()))
				.limit(topCount).collect(Collectors.toList());
	}

	private Integer setTotalExposure(Set<FinancialDtl> financialDtl) {
		return financialDtl.stream().mapToInt(x -> x.getExposure()).sum();
	}

	private long setTotalCustomerCount(Set<FinancialDtl> financialDtl) {
		return financialDtl.stream().count();
	}

	public List<CustomerVO> mapCustomer(List<String> customers) {
		List<CustomerVO> customerVOs = new ArrayList<>();
		customers.forEach(str -> {
			CustomerVO customerVO = new CustomerVO();
			customerVO.setName(str);
			customerVO.setAge(43);
			customerVOs.add(customerVO);
		});

		return customerVOs;
	}

	public List<CustomerVO> mapExposure(List<Sector> sectors) {
		List<CustomerVO> customerVOs = new ArrayList<>();
		sectors.stream().forEach(sec -> {
			Set<FinancialDtl> financialDtl = sec.getFinancialDtl();
			financialDtl.forEach(obj -> {
				CustomerVO customerVO = new CustomerVO();
				customerVO.setName(obj.getCustomerName());
				customerVO.setType(obj.getCustomerType());
				customerVOs.add(customerVO);
			});

		}

		);

		return customerVOs;
	}

	public Set<String> mapFacilities(List<FinancialDtl> financeDtl) {
		Set<String> facilityVOs = new HashSet<>();
		financeDtl.forEach(finance -> {
			facilityVOs.add(finance.getFacilities().getFacilityName());
		});

		return facilityVOs;
	}

}
