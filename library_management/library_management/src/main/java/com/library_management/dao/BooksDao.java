package com.library_management.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.library_management.dto.Books;


public interface BooksDao extends JpaRepository<Books, Integer>
{

}
