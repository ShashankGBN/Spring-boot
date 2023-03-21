package com.hello.controller;

	import javax.servlet.http.HttpServletRequest;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;



	@Controller
	public class HelloMessage {

		@RequestMapping("/print")
		public String display(HttpServletRequest req, Model m)
		{
			String name = req.getParameter("name");
			
			String msg = "Hello "+ name;
			m.addAttribute("message", msg);
			
			
			return "hello.jsp";
		}
		
		
		
	
}
