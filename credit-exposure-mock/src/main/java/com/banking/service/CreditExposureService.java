package com.banking.service;

import com.banking.VO.CreditExposureVO;
import com.banking.exception.BankingException;

public interface CreditExposureService {
	CreditExposureVO findAllCreditExposure() throws BankingException;
}
