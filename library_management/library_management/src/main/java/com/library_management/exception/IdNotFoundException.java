package com.library_management.exception;

public class IdNotFoundException extends Exception 
{	
	private String msg;
	
	public IdNotFoundException()
	{
		
	}
	
	public IdNotFoundException(String msg)
	{
		super(msg);
		this.msg=msg;
	}
}
