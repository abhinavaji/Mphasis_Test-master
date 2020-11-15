package com.banking.VO;

import java.io.Serializable;

public class SectorVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1123218677529739533L;

	private String sectorName;
	private Integer totalExposure;
	private long totalFacilities;
	private long totalCustomers;

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public Integer getTotalExposure() {
		return totalExposure;
	}

	public void setTotalExposure(Integer totalExposure) {
		this.totalExposure = totalExposure;
	}

	public long getTotalFacilities() {
		return totalFacilities;
	}

	public void setTotalFacilities(long totalFacilities) {
		this.totalFacilities = totalFacilities;
	}

	public long getTotalCustomers() {
		return totalCustomers;
	}

	public void setTotalCustomers(long totalCustomers) {
		this.totalCustomers = totalCustomers;
	}

	@Override
	public String toString() {
		return "SectorVO [sectorName=" + sectorName + ", totalExposure=" + totalExposure + ", totalFacilities="
				+ totalFacilities + ", totalCustomers=" + totalCustomers + "]";
	}

}
