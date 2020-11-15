package com.banking.BO;

import java.io.Serializable;

public class FacilityBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3537889966752209654L;
	private Integer id;
	private String name;
	private String type;

	public FacilityBO(Integer id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

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

	@Override
	public String toString() {
		return "Facility [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

}
