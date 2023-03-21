package com.student.dao;

import java.util.List;

import com.student.dto.ClassA;



public interface GenericDAO<T> 
{
	public List<T> getAllStudent();
	
}
