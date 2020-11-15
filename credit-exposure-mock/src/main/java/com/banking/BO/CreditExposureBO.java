package com.banking.BO;

import java.io.Serializable;
import java.util.List;

public class CreditExposureBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1810336509431171847L;

	private List<SectorBO> sectors;

	public List<SectorBO> getSectors() {
		return sectors;
	}

	public void setSectors(List<SectorBO> sectors) {
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
