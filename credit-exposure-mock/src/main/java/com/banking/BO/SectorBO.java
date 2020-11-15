package com.banking.BO;

import java.io.Serializable;
import java.util.List;

public class SectorBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1123218677529739533L;

	private Integer id;
	private String name;
	private String type;
	private Integer exposure;
	private List<FacilityBO> facilities;
	private List<CustomerBO> customers;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getExposure() {
		return exposure;
	}

	public void setExposure(Integer exposure) {
		this.exposure = exposure;
	}

	public List<FacilityBO> getFacilities() {
		return facilities;
	}

	public void setFacilities(List<FacilityBO> facilities) {
		this.facilities = facilities;
	}

	public List<CustomerBO> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerBO> customers) {
		this.customers = customers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Sector [id=" + id + ", name=" + name + ", type=" + type + ", exposure=" + exposure + ", facilities="
				+ facilities + ", customers=" + customers + "]";
	}

}
