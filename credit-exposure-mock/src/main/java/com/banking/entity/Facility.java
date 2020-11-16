package com.banking.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "FACILITY_DTL")
public class Facility {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "FACILITY_NAME")
	private String facilityName;

	@JsonIgnoreProperties("facilities")
	@OneToMany(mappedBy = "facilities", fetch = FetchType.LAZY)
	private Set<FinancialDtl> financialDtl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public Set<FinancialDtl> getFinancialDtl() {
		return financialDtl;
	}

	public void setFinancialDtl(Set<FinancialDtl> financialDtl) {
		this.financialDtl = financialDtl;
	}

}
