package com.banking.VO;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectorVO extends BaseResponseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1123218677529739533L;
	private Integer sectorId;
	private String sectorName;
	private Integer totalExposure;
	private long totalCustomers;

	public Integer getSectorId() {
		return sectorId;
	}

	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}

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

	public long getTotalCustomers() {
		return totalCustomers;
	}

	public void setTotalCustomers(long totalCustomers) {
		this.totalCustomers = totalCustomers;
	}

	@Override
	public String toString() {
		return "SectorVO [sectorId=" + sectorId + ", sectorName=" + sectorName + ", totalExposure=" + totalExposure
				+ ", totalCustomers=" + totalCustomers + "]";
	}

}
