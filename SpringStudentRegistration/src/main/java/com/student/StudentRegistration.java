package com.student;

public class StudentRegistration 
{
	private int stu_Id;
	private String stu_Name;
	private String branch;
	private int contact;
	private String email;
	
	
	public int getStu_Id() {
		return stu_Id;
	}
	public void setStu_Id(int id) {
		this.stu_Id = id;
	}
	public String getStu_Name() {
		return stu_Name;
	}
	public void setStu_Name(String name) {
		this.stu_Name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
