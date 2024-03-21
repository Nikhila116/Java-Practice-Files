package DataBaseConnectivity;

import java.sql.*;

public class ExecutingQueries {
	
   static String url = "jdbc:mysql://localhost:3306/employee_mgmt";
   
   static String Username = "root";
   
   static String Password = "root";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,Username,Password);
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from employee");
		
		System.out.println("S.no "+"Name  "+"E-Mail  ");
		
		
		while(rs.next())
		
			System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+rs.getString(3));
			
		
		
		con.close();
	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
