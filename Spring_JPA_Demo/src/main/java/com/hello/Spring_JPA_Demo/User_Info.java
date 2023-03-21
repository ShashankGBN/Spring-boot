package com.hello.Spring_JPA_Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_Info 
{
	@Id
	private int id;
	private String name;
	private String address;
	
	
	public User_Info(int id, String name, String Address) 
	{
		super();
		this.id=id;
		this.name=name;
		this.address = address;
	}
	public User_Info()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address = address;
	}
	
	@Override
	public String toString() {
		return "User [User Id=" + id + ", User Name=" + name + ", User Address=" + address + "]";
	}
}
