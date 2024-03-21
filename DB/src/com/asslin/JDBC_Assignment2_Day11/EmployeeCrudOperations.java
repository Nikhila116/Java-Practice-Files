//3) Write plain Java classes Employee(Id,name,String[] dept) and perform CRUD operations on dept
//  Ex: Employee : 1, Varma, ["IT","HR"] to 1, Varma, ["IT"] to 1, Vamsi, ["IT"] to to 1, Vamsi, []

package com.asslin.JDBC_Assignment2_Day11;

import java.util.Arrays;

public class EmployeeCrudOperations {
	
	private int Id ;
	
	private String name;
	
	private String[] dept;
	
	public  EmployeeCrudOperations(int Id,String name,String[] dept)
	{
		
		this.Id = Id;
		this.name = name;
		this.dept = dept;
		
		
	}
	
	

	public int getId() {
		return Id;
	}





	public void setId(int Id) {
		this.Id = Id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String[] getDept() {
		return dept;
	}





	public void setDept(String[] dept) {
		this.dept = dept;
	}
	
	
	
	public  void removeDept(String s)
	
	{
		int index =-1;
		
		for(int i=0;i<dept.length;i++)
		{
			if(dept[i].equals(s))
			{
				index = i;
				break;
			}
			
			
		}
		
		if(index!=-1)
		{
			String[] newDepts = new String[dept.length-1];
			
			System.arraycopy(dept, index-1, newDepts, index-1, index);
			
			dept = newDepts;
		}
		
		
		
	}
	
	public void ChangeName(String s)
	{
		String newName = s;
		
		name = s;
	}
	
	public void removeDeptComplete(String s)
	{
		
		int index = -1;
		
		for(int i=0;i<dept.length;i++)
		{
			if(dept[i].equals(s))
			{
				index = i;
			}
			
			if(index == 0)
			{
			   String[] newDept = new String[index];
			   
			   dept = newDept;
				
			}
			
			
		}
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeCrudOperations e = new EmployeeCrudOperations(1,"Nikhila",new String[] {"IT","HR"});
		
		System.out.println("Initial Table order:");
		
		System.out.println(e.getId());
		
		System.out.println(e.getName());
		
		System.out.println(Arrays.toString(e.getDept()));
		
		System.out.println();
		
		
		
		// removing dept item
		
		e.removeDept("HR");
		
        System.out.println("After Removing dept{HR}:");
		
		System.out.println(e.getId());
		
		System.out.println(e.getName());
		
		System.out.println(Arrays.toString(e.getDept()));
		
		System.out.println();
		
		
		//changing name
		
		System.out.println(e.getId());
		
		e.ChangeName("praveena");
		
		System.out.println(e.getName());
		
		System.out.println(Arrays.toString(e.getDept()));
		
		System.out.println();
		
		
		//Removing dept item
		
        System.out.println(e.getId());
		
		e.ChangeName("praveena");
		
		System.out.println(e.getName());
		
		e.removeDeptComplete("IT");
		
		System.out.println(Arrays.toString(e.getDept()));
		
		
		

	}

}
