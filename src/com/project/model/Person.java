package com.project.model;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = -1161938047579074731L;
	
	private String firstName;
	private String lastName;
	private String phone;
	private Address address;
	
	public Person() {
		
	}
		
	public Person(String firstName, String lastName, String phone, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public Address getAddress() {
		return address;
	}
}
