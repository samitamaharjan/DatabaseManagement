package com.project.model;

import java.io.Serializable;

public class BookCopy implements Serializable {

	private static final long serialVersionUID = 5654380069068491357L;
	
	private String isbn;
	private int noOfCopy;
	Book book;
	
	public BookCopy(String isbn, int noOfCopy, Book book){
		this.isbn = isbn;
		this.noOfCopy = noOfCopy;
		this.book = book;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getNoOfCopy() {
		return noOfCopy;
	}

	public Book getBook() {
		return book;
	}
}
