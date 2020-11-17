package com.banking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FINANCIAL_DTL")
public class FinancialDtl {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "CUSTOMER_NAME")
	private String customerName;

	@Column(name = "EXPOSURE")
	private Integer exposure;

	@Column(name = "CUSTOMER_TYPE")
	private String customerType;

	@Column(name = "SECTOR_ID")
	private Integer sectorId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "SECTOR_ID")
	private Sector sector;

	@Column(name = "FACILITY_ID")
	private Integer facilityId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "FACILITY_ID")
	private Facility facilities;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getExposure() {
		return exposure;
	}

	public void setExposure(Integer exposure) {
		this.exposure = exposure;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public Integer getSectorId() {
		return sectorId;
	}

	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}

	public Sector getSector() {
		return sector;
	}

	public void setSector(Sector sector) {
		this.sector = sector;
	}

	public Integer getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public Facility getFacilities() {
		return facilities;
	}

	public void setFacilities(Facility facilities) {
		this.facilities = facilities;
	}

}
