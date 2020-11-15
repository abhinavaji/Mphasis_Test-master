package com.banking.BO;

import java.io.Serializable;

public class CustomerBO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3049867262422833830L;

	private Integer id;
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer age;
	private String Address;

	public CustomerBO(Integer id, String firstName, String middleName, String lastName, Integer age, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		Address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		return "Customer [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", age=" + age + ", Address=" + Address + "]";
	}

}
