//Create Java Classes Employee (int id, String name, Department dept), Department(int id, String name).
//DB: Employee (id,name,departmentId), Department (id,name)

package com.asslin.JDBC_Assignment2_Day11;

public class Employee1 {
	
	private int id ;
	
	private String name;
	
	private Department1 dept;
	

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


	public Department1 getDept() {
		return dept;
	}


	public void setDept(Department1 dept) {
		this.dept = dept;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String toString()
	{
		 return   "Employee Details: emp_id = "+ this.id + ", emp_name = "+ this.name + ", emp_dept = "+ dept.getName() +"";

	}

}
