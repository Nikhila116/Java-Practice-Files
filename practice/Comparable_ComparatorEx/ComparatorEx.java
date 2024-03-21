package Comparable_ComparatorEx;

import java.util.*;


class Student 
{
	
	int rollNo ;
	
	String name ;
	
	Student(int r ,String n)
	{
		this.rollNo = r;
		
		this.name = n;
	}

	public int getrollNo() {
		return rollNo;
	}

	public void setrollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return "Student : "
				+ "name : " + name 
				+"rollno: " + rollNo;
						 
	
	}
	
	
	
}

class sorting implements Comparator<Student>
{
	public int compare(Student o1, Student o2) {
		
	
		int name = o1.getName().compareTo(o2.getName());
		
		//int roll = o1.getrollNo().compareTo(o2.getrollNo());
		
		//return (name == 0) ? name :;
		
		return 0;
		
		
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	

}
