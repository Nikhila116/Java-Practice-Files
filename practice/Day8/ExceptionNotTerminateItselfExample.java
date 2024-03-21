package Day8;

import java.util.*;

public class ExceptionNotTerminateItselfExample
{
	
	static void show()
	{
	System.out.println("please enter a positive number:");
	}
	static void dshow()
	{
		System.out.println("your entry string is not accepted please enter a positive number:");
	}
	
	static void nonZero()
	{
		System.out.println("please enter a non zero value:");
	}
	
	static void nonNegative()
	{
		System.out.println("please enter a postive value:");
	}
	
	

	public static void main(String[] args)
	
 {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean valid = false;
		
		show();
		
	while(!valid)
	 {
		
		try
		
		{	
				
			int n = Integer.parseInt(sc.nextLine());
			
			if(n > 0)
			{
			   System.out.println("accepted");
			   
			   valid=true;
			}
			
			else if(n == 0)
			{
				nonZero();
				
			}
			
			else if(n < 0)
			{
				nonNegative();
				
			}
			
		}
			
		catch(Exception e)
			
		{	
			dshow();
			
		}
			
			
	}	

  }

}
