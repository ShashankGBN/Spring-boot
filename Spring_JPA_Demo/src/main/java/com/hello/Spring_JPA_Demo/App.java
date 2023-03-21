package com.hello.Spring_JPA_Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
  public static void main(String[] args) 
  {
	  EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_demo");
	  
	  EntityManager em = emf.createEntityManager();
	  
	  //to find data
	  User_Info user = em.find(User_Info.class, 4);
	  System.out.println(user);
	  
	  //to load the data
	 /* User_Info user = new User_Info();
	  user.setId(3);
	  user.setName("Naveen");
	  user.setAddress("Yelahanka");
	  
	  em.getTransaction().begin();
	  em.persist(user);
	  em.getTransaction().commit();
	  
	  System.out.println(user); */
	  
	  //to delete the data
	 /* User_Info user = new User_Info(User_Info.class, 4);
	  em.getTransaction().begin();
	  em.remove(user);
	  em.getTransaction().commit();
	  
	  emf.close();
	  em.close();*/
	  
  }
}
