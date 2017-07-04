package com.project.model;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static final long serialVersionUID = 5720335497921250897L;

	// to be checked
	enum BookType {
		Standard, Special
	}

	private int ISBN;
	private String title;
	private boolean available;
	Author author;

	public Book(int ISBN, String title, boolean available, Author author) {
		this.ISBN = ISBN;
		this.title = title;
		this.available = available;
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public boolean isAvailable() {
		return available;
	}

	public Author getAuthor() {
		return author;
	}
}
