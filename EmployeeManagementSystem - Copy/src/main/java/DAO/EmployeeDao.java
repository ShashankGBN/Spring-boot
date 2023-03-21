package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.EmployeeDto;

public class EmployeeDao 
{

		// Method to register and establish connection
		public Connection getConnection() throws SQLException, ClassNotFoundException
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement", "root", "root");
			return con;
		}
		
		public void insertValues(EmployeeDto emp) throws ClassNotFoundException, SQLException
		{
			// Creating query
			PreparedStatement ps = getConnection().prepareStatement("insert into employeedetails value(?,?,?,?,?)");
			
			// Fetching data from student object and setting it to the query
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getEmpName());
			ps.setString(3, emp.getEmpAddress());
			ps.setString(4, emp.getEmpDepartment());
			ps.setLong(5, emp.getSalary());
			
			// Execute the query
			ps.execute();
		}


public void updateValue(EmployeeDto emp) throws ClassNotFoundException, SQLException
{
	PreparedStatement ps = getConnection().prepareStatement("update employeedetails set empname=?, empaddress=?, empdepartment=?, salary=?");
	
	ps.setString(1, emp.getEmpName());
	ps.setString(2, emp.getEmpAddress());
	ps.setString(3, emp.getEmpDepartment());
	ps.setLong(4, emp.getSalary());
	
	ps.execute();
}

public EmployeeDto getEmployeeDto(int empId) throws SQLException , ClassNotFoundException
{
	PreparedStatement ps = getConnection().prepareStatement("select * from employeedetails where empId=?");
	ps.setInt(1, empId);
	
	ResultSet rs = ps.executeQuery();
	EmployeeDto emp = new EmployeeDto();
	 
	while(rs.next())
	{
		ps.setInt(1, emp.getEmpId());
		ps.setString(2, emp.getEmpName());
		ps.setString(3, emp.getEmpAddress());
		ps.setString(4, emp.getEmpDepartment());
		ps.setLong(5, emp.getSalary());
	}
	return emp;
}

}

