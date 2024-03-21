//Using newInstance() method of constructor class.

package Day3;
import java.lang.reflect.*;   //newInstance() method is present in constructor class where we need to import this statement to get the constructor class.
public class Employee {
	//private String n1="kiran";
	String name;
	String manager;
	String dept;
	int age;
	int salary;
	
	Employee()
	{
		System.out.println("\nThis is a default constructor\n");
		System.out.println("----------------------------------------------");


	}
	
	Employee(String name,int age)
	{
		this.name = name;
		this.age = age;

		System.out.println("\nName: "+name);
		System.out.println("Age: "+age+"\n");
		System.out.println("----------------------------------------------");
	}
	
	Employee(String name,int salary,String dept)
	{
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		
		System.out.println("\nName: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Dept: "+dept+"\n");
		System.out.println("----------------------------------------------");
	}
	
	Employee(String name,int salary,int age,String manager,String dept)
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
		try {
		Constructor <Employee> obj = Employee.class.getDeclaredConstructor(); //for getting all the information of how many constructors are present in the class
		
		Employee o = obj.newInstance();  //by using the object created for finding no.of constructors in the class ,with same object we create an new instance of our class
     
		System.out.println(o);   //memory address
		System.out.println(obj);  //Employee()
		
		
		/*System.out.println(o.n1);    //with the object created using newInstance() accessing private members
		o.setName("Kishore");          //accessing of methods
		System.out.println(o.manager);*/
		
		
		o = new Employee("Nikhila",21);
		
		o = new Employee("Nikki",25000,"Development"); 
		
		Employee o1= new Employee("Neelima",20000,21,"Mr.Prabhakar","Technical"); 
		
		System.out.println("\nName: "+o1.name);
		System.out.println("Salary: "+o1.salary);
		System.out.println("Age: "+o1.age);
		System.out.println("Manager: "+o1.manager);
		System.out.println("Dept: "+o1.dept);
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally {
			System.out.println("\n Excecuted....");
		}

	}
}

	