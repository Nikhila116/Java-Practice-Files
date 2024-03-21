package com.aaslin.Assignment_march15;

public class Department1 {
	
	private int id;
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String toString()
	{
		 return   "Employee Details: \nemp_id = "+ this.id + "\nemp_name = "+ this.name +"]";

	}

	

}
