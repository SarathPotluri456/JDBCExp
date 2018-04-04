package JDBCEXP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBC2 {

	public static void main(String[] args) {
		
try
{
	Class.forName("org.postgresql.Driver");
	System.out.println("Registering Driver Finished");
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sarath1",
        "postgres", "tiger");	
	System.out.println("Creating Connection completed");
	 Statement stmt= con.createStatement();
	 System.out.println("Statement Creation completed");
	 
	 stmt.executeUpdate("CREATE TABLE COMPANY " +
	            "(ID INT PRIMARY KEY     NOT NULL," +
	            " NAME           TEXT    NOT NULL, " +
	            " AGE            INT     NOT NULL, " +
	            " ADDRESS        CHAR(50), " +
	            " SALARY         REAL)");
	 System.out.println("Excute update finished");
	 System.out.println("closing the connection");
	 stmt.close();
	
	
	/*PreparedStatement ps=con.prepareStatement("insert into student1 values(?,?,?)");
	ps.setInt(1, 123);
	ps.setString(2,"sarath");
	ps.setString(3, "java");
	ps.executeQuery();*/
	
	con.close();
	
	
}catch(Exception e)
{
	System.out.println(e);
}
	}

}
