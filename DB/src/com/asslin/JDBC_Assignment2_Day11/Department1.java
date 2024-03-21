//Create Java Classes Employee (int id, String name, Department dept), Department(int id, String name).
//DB: Employee (id,name,departmentId), Department (id,name)

package com.asslin.JDBC_Assignment2_Day11;

public class Department1 {
	
	private int id ;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
//	public String toString()
//	{
//		 return   "Employee Details: \nemp_id = "+ this.id + "\nemp_name = "+ this.name +"]";
//
//	}


}
