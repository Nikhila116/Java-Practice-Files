// example of class.newInstance() method of creating objects

package Day3;


public class NewInstanceOfClass {
	
	
	 String name ="Nikhila";
	
	NewInstanceOfClass()
	{
		System.out.println("This is a constructor class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		

		NewInstanceOfClass obj = NewInstanceOfClass.class.newInstance();
			
		
		System.out.println(obj.name);
		
		//obj = new NewInstanceOfClass();		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
