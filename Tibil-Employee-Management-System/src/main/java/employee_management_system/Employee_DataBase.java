package employee_management_system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee_DataBase 
{
	public static void main(String[] args) throws ClassNotFoundException , SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","root");
		
		Statement st = con.createStatement();
		
		st.execute("create database TibilEmployeeManagementSystem");
		
		System.out.println("DataBase created...");
		
		con.close();
	}
}
