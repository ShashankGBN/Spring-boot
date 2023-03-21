package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmployeeDao;
import DTO.EmployeeDto;

@WebServlet("/insert")
public class InsertingEmployeeDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException
	{
		//fetching data from request
		String empId = req.getParameter("empid");
		String empName = req.getParameter("empname");
		String empAddress = req.getParameter("empaddress");
		String empdepartment = req.getParameter("empdept");
		String salary = req.getParameter("empsalary");
		
		//creating student object
		EmployeeDto emp = new EmployeeDto();
		//setting user entered values to object 
		emp.setEmpId(Integer.parseInt(empId));
		emp.setEmpName(empName);
		emp.setEmpAddress(empAddress);
		emp.setEmpDepartment(empdepartment);
		emp.setSalary(Long.parseLong(salary));
		
		
		//sending the student object to dao class
		EmployeeDao dao = new EmployeeDao();
		try
		{
			dao.insertValues(emp);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
