package com.library_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.library_management.dto.Books;
import com.library_management.exception.ErrorResponse;
import com.library_management.exception.IdNotFoundException;
import com.library_management.service.BooksServiceImpl;


@RestController
public class BooksController 
{
	@Autowired(required=true)
	BooksServiceImpl service;
	
	@PostMapping("/save")
	public Books saveBook(@RequestBody Books books)
	{
		return service.saveBook(books);
	}
	
	@GetMapping("/getall")
	public List<Books> getAllBooks()
	{
		return service.getBooksDetails();
	}
	
	@GetMapping("/getbookbyid/{id}")
	public Books getBookById(@PathVariable int id) throws IdNotFoundException
	{
		return service.getBookById(id);
	}
	
	@PutMapping("/update/{id}")
	public Books updateBookDetails(@RequestBody Books books)
	{
		service.saveBook(books);
		return books;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBookDetails(@PathVariable int id)
	{
		service.deleteBookById(id);
	}
	
	
	/*@ExceptionHandler(value = IdNotFoundException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ErrorResponse handleIdNotFoundException(IdNotFoundException ex)
	{
		return new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
	}*/
	
}
