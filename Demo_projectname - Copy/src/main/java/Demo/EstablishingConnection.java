package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EstablishingConnection 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	{
		//to load and register Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//to establish a connection.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		
		//creating a statement
		Statement st = con.createStatement();
		
		//executing the query. 
		st.execute("create database jspiders");
		
		System.out.println("Database created");
		
		
		//close the connection.
		con.close();
	}

}
