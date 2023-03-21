package com.library_management.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="book name", nullable=false, unique=true)
	private String name;
	@Column(name="author name", nullable=false)
	private String author;
	@Column(name="Book Borrowed By", nullable=false)
	private String bookBorrowedBy;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookBorrowedBy() {
		return bookBorrowedBy;
	}
	public void setBookBorrowedBy(String bookBorrowedBy) {
		this.bookBorrowedBy = bookBorrowedBy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
