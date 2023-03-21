package CONTROLLER;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDao;
import DTO.Student;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//fetching data from request
				String id = req.getParameter("myid");
				String name = req.getParameter("myname");
				String age = req.getParameter("myage");
				String address = req.getParameter("myaddress");
				
				//creating student object
				Student s = new Student();
				//setting user entered values to object
				s.setId(Integer.parseInt(id));
				s.setName(name);
				s.setAge(Integer.parseInt(age));
				s.setAddress(address);
				
				//sending the student object to dao class
				StudentDao dao = new StudentDao();
				try
				{
					dao.insertValues(s);
					
					RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
					rd.forward(req, resp);
					
				}
				catch (Exception e)
				{
					System.out.println("Exception Handled...");
					e.printStackTrace();
				}	
	}
}
