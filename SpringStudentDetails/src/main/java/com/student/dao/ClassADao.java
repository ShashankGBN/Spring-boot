package com.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.dto.ClassA;

public class ClassADao implements GenericDAO
{
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	public List<ClassA> getAllStudent() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("SELECT * FROM s_details");
		return query.getResultList();
	}
}
