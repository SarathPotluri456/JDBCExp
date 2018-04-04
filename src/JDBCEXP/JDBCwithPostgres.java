package JDBCEXP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCwithPostgres {

	public static void main(String[] args) {
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("postgres sql driver registred");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sarath1", "postgres", "tiger");
			System.out.println("Connection Established");
			Statement stmt=con.createStatement();
			System.out.println("Statement Creation Completed");
			stmt.executeUpdate("insert into COMPANY values(123,'SARATHBabu',26,'HYD',27000.00)");
			System.out.println("Query Updated");
			con.close();
			
		}catch(Exception e)
		{
			
		}

	}

}
