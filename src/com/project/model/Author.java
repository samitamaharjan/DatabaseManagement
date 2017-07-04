package com.project.model;

import java.io.Serializable;

public class Author extends Person implements Serializable {

	private static final long serialVersionUID = 9201781304188471757L;

	private boolean credential;
	private String bio;

	public Author(String firstName, String lastName, String phone, Address address, boolean credential, String bio) {
		super(firstName, lastName, phone, address);
		this.credential = credential;
		this.bio = bio;
	}

	public boolean isCredential() {
		return credential;
	}

	public String getBio() {
		return bio;
	}
}
