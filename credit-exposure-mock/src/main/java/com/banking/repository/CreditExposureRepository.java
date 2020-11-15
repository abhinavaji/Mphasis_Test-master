package com.banking.repository;

import org.springframework.stereotype.Component;

import com.banking.BO.CreditExposureBO;
import com.banking.exception.BankingException;

@Component
public class CreditExposureRepository {

	public CreditExposureBO findAllCeditExposure() throws BankingException {

		return MockDataClass.getAllCreditExposure();

	}

}
