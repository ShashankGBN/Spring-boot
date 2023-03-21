package employee_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TibilEmployeeManagementSystem", "root", "root");
		
		Statement st = con.createStatement();
		
		st.execute("create table EmpDetails(EmpId integer, EmpName varchar(20), EmailId varchar(30))");
		
		System.out.println("Table Created...");
		
		con.close();
	}

}
