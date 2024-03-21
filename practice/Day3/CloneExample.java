package Day3;

import java.lang.reflect.*;

public class CloneExample implements Cloneable{
	
	
	protected Object clone() throws CloneNotSupportedException  //Object is a generic class , here used as return type.
	{
		return super.clone();
	}
	
		private String n1="kiran";
		String name;
		String manager;
		String dept;
		int age;
		int salary;
		
		CloneExample ()
		{
			System.out.println("\nThis is a default constructor\n");
			System.out.println("----------------------------------------------");


		}
		
		CloneExample (String name,int age)
		{
			this.name = name;
			this.age = age;

			System.out.println("\nName: "+name);
			System.out.println("Age: "+age+"\n");
			System.out.println("----------------------------------------------");
		}
		
		CloneExample (String name,int salary,String dept)
		{
			this.name = name;
			this.salary = salary;
			this.dept = dept;
			
			System.out.println("\nName: "+name);
			System.out.println("Salary: "+salary);
			System.out.println("Dept: "+dept+"\n");
			System.out.println("----------------------------------------------");
		}
		
		CloneExample (String name,int salary,int age,String manager,String dept)
		{
			this.name = name;
			this.salary= salary;
			this.age = age;
			this.manager = manager;
			this.dept = dept;
		}
		
		void setName(String manager)
		{
			this.manager = manager;
			System.out.println(manager);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		Constructor <CloneExample> o = CloneExample.class.getDeclaredConstructor();
		
		CloneExample obj = o.newInstance();
		
		//System.out.println(obj.n1);
		
         obj = new CloneExample("Nikhila",21);
		
		 obj = new CloneExample("Nikki",25000,"Development"); 
		
		CloneExample o1= new CloneExample("Neelima",20000,21,"Mr.Prabhakar","Technical"); 
		
		System.out.println("\nName: "+o1.name);
		System.out.println("Salary: "+o1.salary);
		System.out.println("Age: "+o1.age);
		System.out.println("Manager: "+o1.manager);
		System.out.println("Dept: "+o1.dept);
		
		
		CloneExample obj2 = (CloneExample)obj.clone();   //cloning
		
		System.out.println(obj2.n1);
		
		obj2.setName("pramod");
		
		obj2 = new CloneExample("Nikki",25000,"Development"); //obj2 is the object that got after cloning obj accessing the class using obj2
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
