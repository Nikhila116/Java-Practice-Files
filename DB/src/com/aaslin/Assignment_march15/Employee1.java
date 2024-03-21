package com.aaslin.Assignment_march15;

public class Employee1 {
	
	private int id;
	
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

	public Department1 getDept_name() {
		return dept;
	}

	public void setDept_id(Department1 dept) {
		this.dept = dept;
	}
    
	public String toString()
	{
		return "Employee:"
				+ "employee id = "
				+ this.id+"employee name ="
						+ this.name+"employee Deptname ="
								+ dept.getName()+"";
				
			
	}

}
