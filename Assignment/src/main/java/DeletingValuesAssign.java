import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletingValuesAssign {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/managementsystem", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("delete from managementsystem where id=?");
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id of row that want to be deleated...");
		int id = sc.nextInt();
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
		
		con.close();
		
	}

}
