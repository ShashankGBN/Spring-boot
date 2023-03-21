package student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import student.dto.DataBaseConnection;
import student.dto.StudentRegistrationDTO;

public class StudentRegistrationDAO 
{
	public Connection getConnection() throws SQLException, ClassNotFoundException
	{
		
		Connection con = DataBaseConnection.getConnection();
		return con;
	}
	
	public StudentRegistrationDTO getStudentDetails(int stu_Id) throws SQLException, ClassNotFoundException
	{
		String sql = "Select * from s_details where stu_id=?";
		PreparedStatement ps = getConnection().prepareStatement(sql);
		ps.setInt(1, stu_Id);
		
		ResultSet rs = ps.executeQuery();
		StudentRegistrationDTO dto = new StudentRegistrationDTO();
		
		while(rs.next())
		{
			dto.setStu_Id(rs.getInt(1));
			dto.setStu_Name(rs.getString(2));
			dto.setBranch(rs.getString(3));
			dto.setContact(rs.getInt(4));
			dto.setEmail(rs.getString(5));
		}
		
		return dto;
		
	}
	
	
	
	
	

	public List<StudentRegistrationDTO> getAllData() 
	{
		List<StudentRegistrationDTO> list = null;
		StudentRegistrationDTO dto = null;
		
		try
		{
			list = new ArrayList<StudentRegistrationDTO>();
			String sql = "Select * from s_details";
			
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				dto = new StudentRegistrationDTO();
				dto.setStu_Id(rs.getInt(1));
				dto.setStu_Name(rs.getString(2));
				dto.setBranch(rs.getString(3));
				dto.setContact(rs.getInt(4));
				dto.setEmail(rs.getString(5));
				
				list.add(dto);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return list;
		
	}

	
}
