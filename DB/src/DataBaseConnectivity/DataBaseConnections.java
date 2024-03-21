package DataBaseConnectivity;

import java.sql.*;



public class DataBaseConnections{

	public static void main(String[] args) {
		
		long a= System.currentTimeMillis();
		
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_mgmt","root","root");
			
			Statement st = con.createStatement();
			
			System.out.println("Connected successfully");
			
		}
		catch(Exception e)
		{
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
			
		}
		
		long b = System.currentTimeMillis();
		
		long c = b - a;
		
		System.out.println(c+"Milli Seconds.");
		
	
		
	}

}

