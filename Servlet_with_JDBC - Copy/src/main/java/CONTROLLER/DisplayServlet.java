package CONTROLLER;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDao;
import DTO.Student;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("myid");
		
		StudentDao dao = new StudentDao();
		try {
			Student s = dao.getStudent(Integer.parseInt(id));
			
			resp.setContentType("text/html");
			
			PrintWriter pw = resp.getWriter();
			pw.print(" ID : "+s.getId());
			pw.print(" Name : "+s.getName());
			pw.print(" Age : "+s.getAge());
			pw.print(" Address : "+s.getAddress());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
