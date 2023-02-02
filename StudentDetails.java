package com.springboot.app.SpringBootdemoapplication;

public class StudentDetails 
{
	private int id;
	private String name;
	
	StudentDetails(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}	
	public int getId()
	{
		return id;
	}
	public void setName()
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
