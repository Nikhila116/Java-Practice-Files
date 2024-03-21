package com.asslin.JDBC_Assignment2_Day11;

//4) Write plain java program to set data into Employee list with Salary of last 3 years. 
//Java Object Structure to follow below Employee(id,name,List<Salary>),
//Salary (year,salary)
//Print the above employee list using toString()

import java.util.*;

class Salary
{
	private int Year;
	private double Salary;
	
	Salary(int Year,double Salary)
	{
		this.Year = Year;
		this.Salary = Salary;
	}
	
	public int getYear() {
		return Year;
	}
	
	public void setYear(int year) {
		this.Year = year;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	public String toString()
	{
		
		
		return  "\n----------------------" 
				+"\nYear = "+ Year
				+"\nSalary ="+Salary;
				
				
		
	}
}

class Employee
{
	private int id;
	
	private String name;
	
	private List<Salary> salaries;
	
	Employee(int id,String name,List<Salary> s)
	{
		this.id = id;
		this.name = name;
		this.salaries = s;
	}

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

	public List<Salary> getSalaries() {
		return salaries;
	}

	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
	}
	
	
	
	public String toString()
	{
		return "Employee Details:"
				+"employee id:"+id
				+"\tname:"+name 
				+"\n\nSalary History:"+salaries;
		
		
		  
	}
	
	
}





public class Employee_Salary_history {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Salary s2021 = new Salary(2021,25000);
		
		Salary s2022 = new Salary(2022,30000);
		
		Salary s2023 = new Salary(2023,35000);
		
		List salaries = new ArrayList();
		
		salaries.add(s2021);
		
		salaries.add(s2022);
		
		salaries.add(s2023);
		
		System.out.println("Salary of last 3 years of Employee:\n");
		
		Employee e = new Employee(1,"nikhila",salaries);
		
		
		System.out.println(e);
		
 
	}

}
