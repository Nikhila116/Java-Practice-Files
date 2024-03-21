package DataBaseConnectivity;

import java.sql.*;

import java.sql.DriverManager;

public class ManipulatingTheRecords {
	
	static String Driver ="com.mysql.cj.jdbc.Driver";
	
	static String url = "jdbc:mysql://localhost:3306/employee_mgmt";
	   
	static String Username = "root";
	   
	 static String Password = "root";
	 
	 static String s = "";
	 
	 //insert into employee(name,mail,mobile,dept_id,salary) values ("nikhila","nikki123@gmail.com","9987877889",1,40000);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName(Driver);
			
			Connection con = DriverManager.getConnection(url,Username,Password);
			
			Statement st = con.createStatement();
		
			System.out.println("connected successfully");
			
			int v = st.executeUpdate("insert into employee(name,mail,mobile,dept_id,salary) values('siraj','siraj23@gmail.com','8796545342',2,75000)");
			
			int x = st.executeUpdate("delete from employee where id = 11");
			
			if(x > 0)
			{
				System.out.println("1 row deleted");
			}
			else
			{
				System.out.println("record not found");
			}
			
			if(v>0)
			{
				System.out.println("1 row effected");
			}
			else
			{
				System.out.println("error in inserting");
			}
		}
			
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		

	}

}
