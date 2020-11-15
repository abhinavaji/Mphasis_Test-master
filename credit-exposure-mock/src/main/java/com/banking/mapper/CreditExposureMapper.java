package com.banking.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.banking.BO.CreditExposureBO;
import com.banking.VO.CreditExposureVO;
import com.banking.VO.SectorVO;

@Component
public class CreditExposureMapper {

	public CreditExposureVO map(CreditExposureBO creditExposureBO) {
		CreditExposureVO creditExposureVO = new CreditExposureVO();
		List<SectorVO> sectorVOs = new ArrayList<>();
		if (!ObjectUtils.isEmpty(creditExposureBO.getSectors())) {
			creditExposureBO.getSectors().forEach(sectorBO -> {
				SectorVO sectorvo = new SectorVO();
				sectorvo.setSectorName(sectorBO.getName());
				sectorvo.setTotalExposure(sectorBO.getExposure());
				sectorvo.setTotalCustomers(sectorBO.getCustomers().stream().count());
				sectorvo.setTotalFacilities(sectorBO.getFacilities().stream().count());
				sectorVOs.add(sectorvo);
			}

			);

		}

		creditExposureVO.setSectors(
				sectorVOs.stream().sorted((s1, s2) -> s2.getTotalExposure().compareTo(s1.getTotalExposure()))
						.collect(Collectors.toList()));

		return creditExposureVO;

	}

}
