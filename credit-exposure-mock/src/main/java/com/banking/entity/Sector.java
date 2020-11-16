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
@Table(name = "SECTOR_DTL")
public class Sector {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "SECTOR_NAME")
	private String name;

	@JsonIgnoreProperties("sector")
	@OneToMany(mappedBy = "sector", fetch = FetchType.LAZY)
	private Set<FinancialDtl> financialDtl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<FinancialDtl> getFinancialDtl() {
		return financialDtl;
	}

	public void setFinancialDtl(Set<FinancialDtl> financialDtl) {
		this.financialDtl = financialDtl;
	}

}
