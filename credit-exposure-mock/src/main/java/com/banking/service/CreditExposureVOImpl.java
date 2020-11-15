package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.banking.BO.CreditExposureBO;
import com.banking.VO.CreditExposureVO;
import com.banking.exception.BankingException;
import com.banking.mapper.CreditExposureMapper;
import com.banking.repository.CreditExposureRepository;

@Service
public class CreditExposureVOImpl implements CreditExposureService {

	@Autowired
	private CreditExposureRepository creditExposureRepository;

	@Autowired
	private CreditExposureMapper mapper;

	@Override
	public CreditExposureVO findAllCreditExposure() throws BankingException {
		CreditExposureVO response = new CreditExposureVO();
		CreditExposureBO allExposures = creditExposureRepository.findAllCeditExposure();
		if (!ObjectUtils.isEmpty(allExposures)) {
			response = mapper.map(allExposures);

		} else
			System.out.println("No data for credit exposure found.");
		return response;
	}

}
