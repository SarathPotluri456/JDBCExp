package JDBCEXP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class NewprogresswithPrepared {

	public static void main(String[] args) {
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loading and registration Completed");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sarath1", "postgres", "tiger");
			System.out.println("Database Connection Finished");
			PreparedStatement ps=con.prepareStatement("insert into company values(?,?,?,?,?)");
			ps.setInt(1, 154);
			ps.setString(2, "sarath123");
			ps.setInt(3,23);
			ps.setString(4, "hyd");
			ps.setDouble(5, 65000.00);
			ps.executeUpdate();
		}catch(Exception e)
		{
			
		}

	}

}
