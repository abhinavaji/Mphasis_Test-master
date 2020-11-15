package com.banking.VO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditExposureVO extends BaseResponseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1810336509431171847L;

	private List<SectorVO> sectors;

	public List<SectorVO> getSectors() {
		return sectors;
	}

	public void setSectors(List<SectorVO> sectors) {
		this.sectors = sectors;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CreditExposure [sectors=" + sectors + "]";
	}

}
