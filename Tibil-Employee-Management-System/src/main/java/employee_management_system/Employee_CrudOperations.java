package employee_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee_CrudOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TibilEmployeeManagementSystem", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("insert into EmpDetails values(?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id...");
		int EmpId = sc.nextInt();
		
		System.out.println("Enter employee name...");
		String EmpName = sc.next();
		
		System.out.println("Enter employee Emil Id...");
		String EmailId = sc.next();
		
		ps.setInt(1,EmpId);
		ps.setString(2, EmpName);
		ps.setString(3, EmailId);
		
		ps.executeUpdate();
		
		System.out.println("Data inserted...");
		
		con.close();
	}

}
