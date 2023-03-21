package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Student;

public class StudentDao 
{
	//method to register and establish connection
	public Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user2","root","root");
		return con;
	}
	
	public void insertValues(Student s) throws ClassNotFoundException, SQLException
	{
		//creating query
		PreparedStatement ps = getConnection().prepareStatement("insert into student values(?,?,?,?)");
		
		//fetching data from student object and setting it to the query
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setInt(3, s.getAge());
		ps.setString(4, s.getAddress());
		
		//execute the query.
		ps.execute();
	}
	
	public Student getStudent(int id) throws SQLException, ClassNotFoundException
	{
		PreparedStatement ps = getConnection().prepareStatement("select * from student where id=?");
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		Student s = new Student();
		
		while(rs.next())
		{
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setAge(rs.getInt(3));
			s.setAddress(rs.getString(4));
		}
		return s;
	}
}