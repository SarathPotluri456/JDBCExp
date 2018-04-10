package JDBCEXP;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class ResultSetMetaData1 {

	public static void main(String[] args) {
	try
	{
		Class.forName("org.postgresql.Driver");
		System.out.println("Postgresql Driver registred");
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sarath1", "postgres", "tiger");
		System.out.println("Connection Estsblished");
		Statement stmt=con.createStatement();
		System.out.println("Creation Stament Finished");
		ResultSet rs=stmt.executeQuery("select *from company");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getString(4)+"  "+rs.getDouble(5));;
		}
		System.out.println("Closing Connection");
		ResultSetMetaData rm=rs.getMetaData();
		System.out.println("Total Columns:"+rm.getColumnCount());
		System.out.println("Table Name:"+rm.getTableName(1));
		for(int i=1;i<=rm.getColumnCount();i++)
		{
			System.out.println(rm.getColumnName(i));
		}
		DatabaseMetaData dm=con.getMetaData();
		System.out.println();
		System.out.println("DATABASE INFORMATION");
		System.out.println();
		System.out.println("Drivername:"+dm.getDriverName());
		System.out.println("DriverVersion"+dm.getDriverVersion());
		System.out.println("UserName:"+dm.getUserName());
		System.out.println("DataBase ProductName:"+dm.getDatabaseProductName());
		System.out.println("DataBase Product version"+dm.getDatabaseProductVersion());
		
		con.close();
		
		
	}catch(Exception e)
	{
		
	}

	}

}
