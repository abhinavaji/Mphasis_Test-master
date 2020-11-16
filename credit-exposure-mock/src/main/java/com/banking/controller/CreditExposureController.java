package com.banking.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banking.VO.CustomerVO;
import com.banking.VO.SectorVO;
import com.banking.exception.BankingException;
import com.banking.service.CreditExposureService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "dashboard/")
public class CreditExposureController {
	@Autowired
	CreditExposureService creditExposureService;

	@ApiOperation(value = "Get Top Sector Details.", notes = "get top sector by providing number of top records count.")
	@GetMapping("findTopSectors")
	public ResponseEntity<List<SectorVO>> findAllCreditExposure(@RequestParam(required = true) Integer topCount)
			throws BankingException {
		List<SectorVO> responseVo = creditExposureService.findAllSectors(topCount);
		if (ObjectUtils.isEmpty(responseVo)) {

			throw new BankingException("Error while fetching credit exposure informations.");
		}
		return new ResponseEntity<>(responseVo, new HttpHeaders(), HttpStatus.OK);
	}

	@ApiOperation(value = "Get All Customer Details of any Sector.", notes = "get all customers of any sector by providing secor id.")
	@GetMapping("findAllCustomers")
	public ResponseEntity<List<CustomerVO>> findAllCustomers(@RequestParam(required = true) Integer sectorId)
			throws BankingException {
		List<CustomerVO> responseVo = creditExposureService.findAllCustomers(sectorId);
		if (ObjectUtils.isEmpty(responseVo)) {

			throw new BankingException("Error while fetching credit exposure informations.");
		}
		return new ResponseEntity<>(responseVo, new HttpHeaders(), HttpStatus.OK);
	}

	@ApiOperation(value = "Get All Exposure Details of any Sector.", notes = "get all exposure of any sector by providing secor id.")
	@GetMapping("findExposure")
	public ResponseEntity<List<CustomerVO>> findExposure(@RequestParam(required = true) Integer sectorId)
			throws BankingException {
		List<CustomerVO> responseVo = creditExposureService.findAllExposure(sectorId);
		if (ObjectUtils.isEmpty(responseVo)) {

			throw new BankingException("Error while fetching credit exposure informations.");
		}
		return new ResponseEntity<>(responseVo, new HttpHeaders(), HttpStatus.OK);
	}

	@ApiOperation(value = "Get All Facilities Details of any Sector.", notes = "get all facilities of any sector by providing secor id.")
	@GetMapping("findAllFacilities")
	public ResponseEntity<Set<String>> findAllFacilities(@RequestParam(required = true) Integer sectorId)
			throws BankingException {
		Set<String> responseVo = creditExposureService.findAllFacilities(sectorId);
		if (ObjectUtils.isEmpty(responseVo)) {

			throw new BankingException("Error while fetching facilities.");
		}
		return new ResponseEntity<>(responseVo, new HttpHeaders(), HttpStatus.OK);
	}

}