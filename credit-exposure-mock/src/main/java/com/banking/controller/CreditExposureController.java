package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.VO.CreditExposureVO;
import com.banking.exception.BankingException;
import com.banking.service.CreditExposureService;

@RestController
@RequestMapping(value = "dashboard/")
public class CreditExposureController {
	@Autowired
	CreditExposureService creditExposureService;

	@GetMapping("findAllExposure")
	public ResponseEntity<CreditExposureVO> findAllCreditExposure() throws BankingException {
		CreditExposureVO responseVo = creditExposureService.findAllCreditExposure();
		if (ObjectUtils.isEmpty(responseVo)) {

			throw new BankingException("Error while fetching credit exposure informations.");
		}
		return new ResponseEntity<>(responseVo, new HttpHeaders(), HttpStatus.OK);
	}
}