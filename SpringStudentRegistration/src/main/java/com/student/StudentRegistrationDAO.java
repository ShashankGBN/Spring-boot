package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class StudentRegistrationDAO 
{
	
	
	
	public String userRegistration(String name, String branch, String contact, String email) {

		Connection con = null;
		String result = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_registration?autoReconnect=true&useSSL=false",
					"root", "root");
			Statement st = con.createStatement();
			int i = st.executeUpdate(
					"insert into s_details(Stu_Name,Branch,Contact,Email) values('" + name
							+ "','" + branch + "','" + contact + "','" + email + "')");

			if (i > 0) {
				result = name;
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

		return result;
	}
	
	
	public StudentRegistration getListOfObjects(int stu_Id)
	{
		Connection con = null;
		StudentRegistration studentRegistration = new StudentRegistration();
		
		List<StudentRegistration> arrayList = new ArrayList<StudentRegistration>();

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_registration?autoReconnect=true&useSSL=false",
					"root", "root");
			PreparedStatement ps = con.prepareStatement("Select * from s_details where stu_Id = ?");
			
			ps.setInt(1, stu_Id);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) 
			{
					   studentRegistration.setStu_Id(rs.getInt(1));
					   studentRegistration.setStu_Name(rs.getString(2));
					   studentRegistration.setBranch(rs.getString(3));
					   studentRegistration.setContact(rs.getInt(4));
					   studentRegistration.setEmail(rs.getString(5));			   
			}	
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}

		return studentRegistration;
	}
	
	

}
