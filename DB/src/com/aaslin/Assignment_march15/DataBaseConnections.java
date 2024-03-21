package com.aaslin.Assignment_march15;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseConnections {
	
	static String Driver ="com.mysql.cj.jdbc.Driver";
		
	static String url = "jdbc:mysql://localhost:3306/employee_system";

	static String Username = "root";

	static String Password = "root";

	static Connection con = null;
	
	static Statement st = null;

 //   static ResultSet rs = null;
	
	
	//connection to database
	public  static boolean Connections(boolean isConnected)
	{
        
	     try 
	     {
	     
	     Class.forName(Driver);
	     
	     con = DriverManager.getConnection(url,Username,Password);
	     
	     return true;
	     
	     }
	     catch(ClassNotFoundException e)
	     {
	    	 e.printStackTrace();
	    	 
	    	 return false;
	    	 
	     }
	    	
	     catch(SQLException  e)
	     {
	    	 e.printStackTrace();
	    	 
	    	 return false;
	     }
	}     	 
	
	
	//inserting to database.
	public static boolean Inserting(String query)
	{
		
    	
		try 
		{	
			
	    st = con.createStatement();
	    
		st.executeUpdate(query);	
		
		return true;
		
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
			
			return false;
		}
		
	}
	
	
	    //deleting record in database.
		public static boolean deleting(String delquery)
		{
			
	    	
			try 
			{	
				
		    st = con.createStatement();
		    
			st.executeUpdate(delquery);	
			
			return true;
			
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
				
				return false;
			}
		
	}
		
		
		

		//Updating record in database.
		public static boolean Updating(String updatingQuery) {
			// TODO Auto-generated method stub
			
			try 
			{	
				
		    st = con.createStatement();
		    
			st.executeUpdate(updatingQuery);	
			
			return true;
			
			}
			
			catch(SQLException e)
			{
				e.printStackTrace();
				
				return false;
			}
		}


		
		

}
