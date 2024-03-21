package Day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeAndDeserializeExample implements Serializable {
	
	
		private String n1="kiran";
		String name;
		String manager;
		String dept;
		int age;
		int salary;
		
		SerializeAndDeserializeExample()
		{
			System.out.println("\nThis is a default constructor\n");
			System.out.println("----------------------------------------------");


		}
		
		SerializeAndDeserializeExample(String name,int age)
		{
			this.name = name;
			this.age = age;

			/*System.out.println("\nName: "+name);
			System.out.println("Age: "+age+"\n");
			System.out.println("----------------------------------------------");*/
			
		}
		
		SerializeAndDeserializeExample(String name,int salary,String dept)
		{
			this.name = name;
			this.salary = salary;
			this.dept = dept;
			
		/*	System.out.println("\nName: "+name);
			System.out.println("Salary: "+salary);
			System.out.println("Dept: "+dept+"\n");
			System.out.println("----------------------------------------------");*/
			
		}
		
		SerializeAndDeserializeExample(String name,int salary,int age,String manager,String dept)
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
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//serialization
		SerializeAndDeserializeExample s = new SerializeAndDeserializeExample("kiranmai",21);
		
		 s = new SerializeAndDeserializeExample("rukmini",24,"HR");
		
		
	try {
			
			    FileOutputStream fos = new FileOutputStream("f.txt");
		
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(s);
				
				oos.close();
				
				fos.close();
				
			
		} 
   catch(Exception e)
		
	{
			
	   e.printStackTrace();
		
	}
		
		
		//SerializeAndDeserializeExample s1 = null;
		
		//deserialization 
		
		try 
		{
			FileInputStream fis = new FileInputStream("f.txt");
			
			ObjectInputStream ous = new ObjectInputStream(fis);
			
			s = (SerializeAndDeserializeExample)ous.readObject();
			
			ous.close();
			
			fis.close();
			
			System.out.println(s.name);
			
			
	
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		

	}

}
