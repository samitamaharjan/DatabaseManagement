package com.project.model;

import java.io.Serializable;
import java.time.LocalDate;

public class CheckoutRecordEntry implements Serializable {

	private static final long serialVersionUID = 3212119783452653024L;

	private String item;
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private BookCopy bookcopy;

	public CheckoutRecordEntry(String item, LocalDate checkoutDate, LocalDate dueDate, BookCopy bookcopy) {
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.bookcopy = bookcopy;
	}

	public String getItem() {
		return item;
	}

	public BookCopy getBookcopy() {
		return bookcopy;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}
}
