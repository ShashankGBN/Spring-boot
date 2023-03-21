package com.davis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController 
{
LoginDAO dao= new LoginDAO();
	
	@RequestMapping("/login")
	public ModelAndView loginUser(HttpServletRequest req,HttpServletResponse res) {
		
		String uname= req.getParameter("u");
		String pass=req.getParameter("p");
		
		String result=null;
		result=dao.Validate(uname,pass);
		
		ModelAndView mv= new ModelAndView();
		if(result.equals("Success")) {
			mv.setViewName("Home.jsp");
			mv.addObject("name",uname);
		}else {
			mv.setViewName("index1.jsp");
		}
		
		return mv;
		
	}

	
	@RequestMapping("/register")
	public ModelAndView UserRegistration(HttpServletRequest req,HttpServletResponse res) {
		
		String name=req.getParameter("name");
		String branch=req.getParameter("branch");
		String contact=req.getParameter("contact");
		String email=req.getParameter("email");
		String userName=req.getParameter("userName");
		String passWord=req.getParameter("passWord");
		
		String result=null;
		result=dao.userRegistration(name,branch,contact,email,userName,passWord);
		
		ModelAndView mv= new ModelAndView();
		if(result!=null) {
			mv.setViewName("Home.jsp");
			mv.addObject("name",userName);
		}else {
		    mv.setViewName("Registration1.jsp");	
		}
		
		return mv;
	}
}
