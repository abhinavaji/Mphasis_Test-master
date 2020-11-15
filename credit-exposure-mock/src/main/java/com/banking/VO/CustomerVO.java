package com.banking.VO;

import java.io.Serializable;

public class CustomerVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3049867262422833830L;

	private String name;
	private Integer age;
	private String Address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "CustomerVO [name=" + name + ", age=" + age + ", Address=" + Address + "]";
	}

}
