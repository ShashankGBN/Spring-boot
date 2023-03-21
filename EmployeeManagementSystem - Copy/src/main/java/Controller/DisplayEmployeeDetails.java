package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmployeeDao;
import DTO.EmployeeDto;

@WebServlet("/view")
public class DisplayEmployeeDetails extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String empId = req.getParameter("empId");
		
		EmployeeDao emp = new EmployeeDao();
		try {
			EmployeeDto em = emp.getEmployeeDto(Integer.parseInt(empId));
			
			resp.setContentType("text/html");
			
			PrintWriter pw = resp.getWriter();
			pw.print("EmpID :"+ em.getEmpId());
			pw.print("Emp Name :"+ em.getEmpName());
			pw.print("Emp Address :"+ em.getEmpAddress());
			pw.print("Emp Department :"+ em.getEmpDepartment());
			pw.print("Emp Salary :"+ em.getSalary());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
