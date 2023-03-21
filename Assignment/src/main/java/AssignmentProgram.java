import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AssignmentProgram 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/managementsystem", "root", "root");
		
        PreparedStatement ps = con.prepareStatement("insert into managementsystem values(?, ?, ?, ?)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id...");
		int id = sc.nextInt();
		System.out.println("enter employee name...");
		String name = sc.next();
		System.out.println("enter employee phone number...");
		long phone_num = sc.nextLong();
		System.out.println("enter age...");
		int age = sc.nextInt();
		
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setLong(3, phone_num);
		ps.setInt(4, age);
		
		ps.executeUpdate();
		
		con.close();
	}

}
