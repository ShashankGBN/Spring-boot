package com.springboot.app.SpringBootdemoapplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailsController 
{
	@GetMapping("/student")
	public StudentDetails getStudentDetails()
	{
		return new StudentDetails(1 , "Abhi");
	}
	
	@GetMapping("/students")
	public List<StudentDetails> getStudents()
	{
		List<StudentDetails> std = new ArrayList<>();
		std.add(new StudentDetails(1,"Kishore"));
		std.add(new StudentDetails(2,"Kiran"));
		std.add(new StudentDetails(3, "Lokesh"));
		std.add(new StudentDetails(4,"Fahad"));
		return std;
	}
}
