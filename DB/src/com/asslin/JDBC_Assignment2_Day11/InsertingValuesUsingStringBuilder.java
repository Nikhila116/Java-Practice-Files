package com.asslin.JDBC_Assignment2_Day11;



import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertingValuesUsingStringBuilder {
	
	
	
	static String url = "jdbc:mysql://localhost:3306/employee_system";

	static String Username = "root";

	static String Password = "root";

	static Connection con = null;

	static Statement st = null;

	static ResultSet rs = null;

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
     try {
    	 int k = 0;
    	 
    	 int c = 0;
    	 
    	 Scanner s = new Scanner(System.in);
    	 
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, Username, Password);
		
		System.out.println("Connectd successfully");

		st = con.createStatement();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("insert into employee1(id,name,dept_id)");
		
		sb.append("values(?,?,?)");
		
		PreparedStatement ps = con.prepareStatement(sb.toString());
		
		System.out.println("please enter number of rows you wanted to insert into employee1 table :");
		
		int n = s.nextInt();
		
		for(int i=1 ;i<=n ;i++)
		{
			System.out.println("please enter id number:");
			
			int v = s.nextInt();
			
			System.out.println("please enter name:");
			
			String str = s.next();
			
			System.out.println("please enter department id:");
			
			int v1 = s.nextInt();
		
		    ps.setInt(1, v);
		
		    ps.setString(2, str);
		
		    ps.setInt(3, v1);
		    
		    c = ps.executeUpdate();
		    
		    k =	k+1;
		
		
		}
		
		//int c = ps.executeUpdate();
		
		if(c>0)
		{
			System.out.println(k + " row affected");
		}
		else
		{
			System.out.println("There is an error inserting row");
		}
		
		//System.out.println(sb);
		
		ps.close();
		
		con.close();

	}
     
     catch(SQLException e)
     {
    	 e.printStackTrace();
     }

}
}
