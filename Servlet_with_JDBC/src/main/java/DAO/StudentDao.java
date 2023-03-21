package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DTO.Student;

public class StudentDao 
{
	// Method to register and establish connection
	public Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
		return con;
	}
	
	public void insertValues(Student s) throws ClassNotFoundException, SQLException
	{
		// Creating query
		PreparedStatement ps = getConnection().prepareStatement("insert into student value(?,?,?,?)");
		
		// Fetching data from student object and setting it to the query
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setInt(3, s.getAge());
		ps.setString(4, s.getAddress());
		
		// Execute the query
		ps.execute();
	}
}
