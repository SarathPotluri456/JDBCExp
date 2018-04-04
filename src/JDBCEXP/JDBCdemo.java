package JDBCEXP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCdemo {

	public static void main(String[] args) {
	try
	{
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Registering the oracle Driver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
		System.out.println("Creating the connection");
		Statement stmt=con.createStatement();
		System.out.println("Creating the Statement");
		
        int c=stmt.executeUpdate("insert into emp values(123,'sdfj','.net')");
        System.out.println(c+" records added");
        ResultSet rs=stmt.executeQuery("select *from emp");
		/*System.out.println("1 row is inserted");
		System.out.println("Closing the Connection ");*/
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		con.close();
		
		
		
	}
	catch(Exception e) 
	{
		
	}

	}

}
