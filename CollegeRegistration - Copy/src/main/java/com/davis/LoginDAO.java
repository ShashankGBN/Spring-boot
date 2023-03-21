package com.davis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO 
{
	public String Validate(String uname, String pass) {

		Connection con = null;
		String password = null;
		String result = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/davis?autoReconnect=true&useSSL=false",
					"root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT passWord FROM user_details WHERE userName='" + uname + "'");

			while (rs.next()) {
				password = rs.getString(1);
			}

			if (password.equals(pass)) {
				result = "Success";
			} else {
				result = "Fail";
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;
	}

	public String userRegistration(String name, String branch, String contact, String email, String userName,
			String passWord) {

		Connection con = null;
		String result = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/davis?autoReconnect=true&useSSL=false",
					"root", "root");
			Statement st = con.createStatement();
			int i = st.executeUpdate(
					"insert into user_details(Student_Name,Branch,Contact,Email,userName,passWord) values('" + name
							+ "','" + branch + "','" + contact + "','" + email + "','" + userName + "','" + passWord
							+ "')");

			if (i > 0) {
				result = userName;
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return result;
	}

}
