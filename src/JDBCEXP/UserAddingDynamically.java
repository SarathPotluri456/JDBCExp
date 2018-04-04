package JDBCEXP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import org.omg.Messaging.SyncScopeHelper;

public class UserAddingDynamically {

	public static void main(String[] args) {
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Registred");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sarath1", "postgres", "tiger");
			System.out.println("Connectino Established");
			Scanner sc=new Scanner(System.in);
			String x="";
			
			do
			{
				System.out.println("Enter Emp id:");
				int id=sc.nextInt();
				System.out.println("Enter Emp Name:");
				String name=sc.next();
				System.out.println("Enter Age");
				int age=sc.nextInt();
				System.out.println("Enter Address");
				String addr=sc.next();
				System.out.println("Enter Salary");
				double salary=sc.nextDouble();
				PreparedStatement ps=con.prepareStatement("insert into company values(?,?,?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, age);
				ps.setString(4, addr);
				ps.setDouble(5,salary);
				ps.executeUpdate();
				System.out.println("Enter your Choice");
				System.out.println("yes to continue");
				System.out.println("No to Exit");
				
				x=sc.next();
				
			}while(x.startsWith("y"));
			
		}catch(Exception e)
		{
			
		}
	}

}
