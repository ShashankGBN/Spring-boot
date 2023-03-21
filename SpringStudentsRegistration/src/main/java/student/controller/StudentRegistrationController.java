package student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import student.dao.StudentRegistrationDAO;
import student.dto.StudentRegistrationDTO;

//@WebServlet("/search")
@Controller
public class StudentRegistrationController extends HttpServlet
{
	@RequestMapping("/search")
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String stu_Id = req.getParameter("stu_Id");
		
		StudentRegistrationDAO dao = new StudentRegistrationDAO();
		try {
			StudentRegistrationDTO dto = dao.getStudentDetails(Integer.parseInt(stu_Id));
			
			resp.setContentType("text/html");
			
			PrintWriter pw = resp.getWriter();
			pw.print(" ID:"+ dto.getStu_Id());
			pw.print("  Name:"+ dto.getStu_Name());
			pw.print("  Branch:"+ dto.getBranch());
			pw.print("  Contact:"+ dto.getContact());
			pw.print("  Email:"+ dto.getEmail());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/viewstudetails")
	public ModelAndView getALLStu()
	{
		StudentRegistrationDAO dao = new StudentRegistrationDAO();
		List<StudentRegistrationDTO> list = dao.getAllData();
		
		ModelAndView modelAndView = new ModelAndView("viewall.jsp");
		modelAndView.addObject("list", list);
		return modelAndView;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*  to fetch details by id
	 @RequestMapping(value="/search/{stu_Id}")    
    public String displayAll(@PathVariable int stu_Id, Model m) throws ClassNotFoundException, SQLException
 {
	 StudentRegistrationDAO dao = new StudentRegistrationDAO();
        StudentRegistrationDTO dto = dao.getStudentDetails(stu_Id);    
        m.addAttribute("command",dto);  
        return "viewstudetails";    
    }    */



/* to fetch all the data
 @RequestMapping(value="/viewstudetails")
public void studentList(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
{
	StudentRegistrationDAO dao = new StudentRegistrationDAO();
	RequestDispatcher dispatcher = null;
	
	List<StudentRegistrationDTO> list = dao.getAllData();
	req.setAttribute("list", list);
	
	dispatcher = req.getRequestDispatcher("viewall.jsp");
	dispatcher.forward(req, res);	
}*/

	
	
}
