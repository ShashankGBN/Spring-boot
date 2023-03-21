package com.library_management.service;

import java.util.List;

import com.library_management.exception.IdNotFoundException;

public interface BooksService<T> {

	public T saveBook(T t);
	
	public List<T> getBooksDetails();
	
	public T getBookById(int id) throws IdNotFoundException;
	
	public void deleteBookById(int id);
	
}
