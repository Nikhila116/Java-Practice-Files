package WeekendWorkDay6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
	try 
	{
		
		   try 
		      {	
			   
			   int a = sc.nextInt();
			   
			   int b = sc.nextInt();
			   
			   System.out.println(a/b);	
			   
		      }
		   
		 catch(InputMismatchException e)
		     {
			 
			  e.printStackTrace();
			  
		     }
	}
			
		
	 
	catch(Exception e)
	
	{
		
			//System.out.println(e.getMessage());
		    e.printStackTrace();
		
			
	}
		

	}

}
