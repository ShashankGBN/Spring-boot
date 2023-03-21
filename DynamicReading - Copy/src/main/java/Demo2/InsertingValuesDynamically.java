package Demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingValuesDynamically 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("insert into employee values(?, ?, ?)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id...");
		int id = sc.nextInt();
		System.out.println("enter employee name...");
		String name = sc.next();
		System.out.println("enter employee salary...");
		int salary = sc.nextInt();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, salary);
		
		ps.executeUpdate();
		
		con.close();
		
	}
}
