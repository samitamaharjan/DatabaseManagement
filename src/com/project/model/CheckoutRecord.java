package com.project.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord implements Serializable {

	private static final long serialVersionUID = -3745534127313575440L;

	private List<CheckoutRecordEntry> entry;
	private LibraryMember member;

	public CheckoutRecord(CheckoutRecordEntry e) {
		this.entry = new ArrayList<CheckoutRecordEntry>();
	}

	public LibraryMember getMember() {
		return member;
	}

	public List<CheckoutRecordEntry> getEntry() {
		return entry;
	}

	public void addEntry(CheckoutRecordEntry e) {
		entry.add(e);
	}
}
