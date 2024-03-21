package com.asslin.JDBC_Assignment2_Day11;

import java.sql.*;

import java.util.*;

public class RetrievingEmployeeDetailsAndDepartmentname {

	static String url = "jdbc:mysql://localhost:3306/employee_system";

	static String Username = "root";

	static String Password = "root";

	static Connection con = null;

	static Statement st = null;

	static ResultSet rs = null;

	public static List<Employee1> func(String Query) throws ClassNotFoundException

	{
		 List<Employee1> l = new ArrayList<Employee1>();
		try {
			
			Employee1 e;
			
			rs = st.executeQuery(Query);

			// List<Employee1> l = new ArrayList<Employee1>();

			while (rs.next()) {
				
				e = new Employee1();

				e.setId(rs.getInt(1));

				e.setName(rs.getString(2));

				Department1 d = new Department1();
				
				d.setId(rs.getInt(1));

				d.setName(rs.getString(3)); // 'd' is a department class object stores the details that we are going to
											// set for department methods retrived from the DB.

				e.setDept(d); // storing department name in the method that is present in employee class

				l.add(e); // adding employee object that contains all the details of id,name and dept_name
							// to list

				e = null;

				d = null;

			}

		}

		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}

		return l;

	}

	public static void main(String[] args) 
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, Username, Password);
			
			System.out.println("Connectd successfully");

			st = con.createStatement();
			
			String Query = "select id,name,dept_name from employee1 as e inner join department1 as d on e.dept_id = d.dept_id";

			List<Employee1> rs = func(Query);

			for (Employee1 ele : rs)

			{

				System.out.println(ele.toString());

			}

		} 
		catch (Exception e) 
		{

			System.out.println(e.getMessage());

			e.printStackTrace();

		}

		finally 
		{

			try 
			{
				if(rs!=null)
					
				rs.close();

			} 
			catch (SQLException e)
			{
				
				e.printStackTrace();
			}

			try 
			{
				if(st!=null)
					
				st.close();
				
			} 
			catch (SQLException e) {
				
				e.printStackTrace();
			}

			try
			{
				if(con!=null)
					
				con.close();
			} 
			catch (SQLException e)
			{
				
				e.printStackTrace();
			}

		}

	}

}
