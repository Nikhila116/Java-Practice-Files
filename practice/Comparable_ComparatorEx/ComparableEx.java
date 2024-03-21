package Comparable_ComparatorEx;

import java.util.*;

class Employee implements Comparable<Employee>
{
	int id;
	
	String name;
	
	Employee(int id,String name)
	{
		this.id = id;
		
		this.name = name;
	}
	
//	private int getId()
//	{
//		return id;
//	}
//	
//	private String getName()
//	{
//		return name;
//	}
	


public int compareTo(Employee e)
{
    if(id == e.id)
	{
	return 0;
	}
	
	else if(id > e.id)
	{
		return 1;     
	}
	
	else
	{
		return -1;
	}
	
	
	
}

}



public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> al = new ArrayList<Employee>();
		
		
		al.add(new Employee(102,"nikhila"));
		
		al.add(new Employee(201,"nikki"));
		
		al.add( new Employee(103,"nikk"));
		
		Collections.sort(al);
		
		for(Employee e : al)
		{
			System.out.println(e.id + " "+e.name);
			
		}
		
		
		

	}

}
