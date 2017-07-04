package com.project.model;

import java.io.Serializable;

public class LibraryMember extends Person implements Serializable {

	private static final long serialVersionUID = -3088103115147220469L;

	private CheckoutRecord checkoutRecord;
	private int memberId;

	public LibraryMember(int memberId, String firstName, String lastName, String phone, Address address) {
		super(firstName, lastName, phone, address);
		this.memberId = memberId;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public int getMemberId() {
		return memberId;
	}
}
