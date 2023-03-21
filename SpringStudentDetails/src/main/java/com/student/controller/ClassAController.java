package com.student.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.student.dto.ClassA;



public class ClassAController 
{
	@RequestMapping("/viewallstudents")
	public ModelAndView getAllStudents() {
		List<ClassA> students=classAService.getAllStudent();
		
		ModelAndView modelAndView=new ModelAndView("classA.jsp");
		modelAndView.addObject("students1", students);
		return modelAndView;
	}
}
