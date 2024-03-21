package DataBaseConnectivity;

import java.sql.*;

public class RetrievingRecords {
	
static String Driver ="com.mysql.cj.jdbc.Driver";
	
	static String url = "jdbc:mysql://localhost:3306/employee_mgmt";
	   
	static String Username = "root";
	   
	 static String Password = "root";
	 
	 static String s = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		Class.forName(Driver);
		
		Connection c = DriverManager.getConnection(url,Username,Password);
		
		Statement st = c.createStatement();
		
		System.out.println("Connected Succesfully to employee_mgmt database\n");
		
		ResultSet rs = st.executeQuery("select * from employee");
		
		System.out.println("Retriving the records from employee table: ");
		
		while(rs.next())
			
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+rs.getString(3));
		
		
		c.close();
	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}