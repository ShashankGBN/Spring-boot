import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchingValuesAssin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/managementsystem", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("Select * from managementsystem where id=?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee id...");
		int id = sc.nextInt();
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4));
		}
		
		con.close();
	}

}
