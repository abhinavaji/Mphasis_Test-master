package com.banking.VO;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerVO extends BaseResponseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3049867262422833830L;

	private String name;
	private Integer age;
	private String Address;
	private String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CustomerVO [name=" + name + ", age=" + age + ", Address=" + Address + ", type=" + type + "]";
	}

}
