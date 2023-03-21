import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatingValuesAssin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/managementsystem", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("update managementsystem set name = ? where id = ?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id...");
		int id = sc.nextInt();
		System.out.println("enter name...");
		String name = sc.next();
		
		ps.setString(1, name);
		ps.setInt(2, id);
		
		ps.executeUpdate();
		con.close();
	}
}
