package com.library_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library_management.dao.BooksDao;
import com.library_management.dto.Books;
import com.library_management.exception.IdNotFoundException;

@Service
public class BooksServiceImpl implements BooksService<Books>
{
	@Autowired(required=true)
	private BooksDao booksDao;

	@Override
	public Books saveBook(Books books) {
		
		return booksDao.save(books);
	}

	@Override
	public List<Books> getBooksDetails() {
		return booksDao.findAll();
	}

	@Override
	public Books getBookById(int id) throws IdNotFoundException
	{
		Optional<Books> opt = booksDao.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
		{
			throw new IdNotFoundException("Book with id "+id+" does not exist in the library");
		}
	}

	@Override
	public void deleteBookById(int id) {
		booksDao.deleteById(id);;
	}

	
}
