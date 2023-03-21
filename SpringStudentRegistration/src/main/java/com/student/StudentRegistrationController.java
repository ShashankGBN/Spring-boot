package com.student;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class StudentRegistrationController 
{
StudentRegistrationDAO dao= new StudentRegistrationDAO();
	
	
	@RequestMapping("/register")
	public ModelAndView UserRegistration(HttpServletRequest req,HttpServletResponse res) {
		
		String name=req.getParameter("name");
		String branch=req.getParameter("branch");
		String contact=req.getParameter("contact");
		String email=req.getParameter("email");
		
		
		String result=null;
		result=dao.userRegistration(name,branch,contact,email);
		
		ModelAndView mv= new ModelAndView();
		if(result!=null) {
			mv.setViewName("studentform.jsp");
			mv.addObject("name",name);
			mv.addObject("branch",branch);
			mv.addObject("contact", contact);
			mv.addObject("email", email);
		}else {
		    mv.setViewName("studentform.jsp");	
		}
		
		return mv;
	}
	
	
	
	
	
	
}
