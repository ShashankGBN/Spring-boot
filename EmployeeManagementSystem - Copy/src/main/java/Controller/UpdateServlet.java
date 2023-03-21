package Controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.EmployeeDao;
import DTO.EmployeeDto;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	{
		String empId = req.getParameter("empid");
		String empName = req.getParameter("empname");
		String empAddress = req.getParameter("empaddress");
		String empdepartment = req.getParameter("empdept");
		String salary = req.getParameter("empsalary");
		
		EmployeeDto emp = new EmployeeDto();
		emp.setEmpId(Integer.parseInt(empId));
		emp.setEmpName(empName);
		emp.setEmpAddress(empAddress);
		emp.setEmpDepartment(empdepartment);
		emp.setSalary(Long.parseLong(salary));
		
		
	}
}
