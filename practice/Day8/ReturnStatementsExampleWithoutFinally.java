package Day8;

import java.util.*;

public class ReturnStatementsExampleWithoutFinally {
	
	static int noFinally(int a,int b) 
	{
		 try {
			   int divide;
			   
			   divide = a/b;
			   
			  // System.out.println(divide);
			   
			   return divide;
			   
			    
			   
		   }
		   
		   catch(ArithmeticException e)
		   {
			   System.out.println("Exception caught,if caught returned value will be zero and caught by "+e.toString());
			   
			   return 0;
			   
			   
		   }

		
	}
	
	public static void main(String[] args)
	
	{
		
		   Scanner sc = new Scanner(System.in);
		   
		   int a = sc.nextInt();
		   
		   int b = sc.nextInt();
		   
		   int res =noFinally(a,b);
		   
		   System.out.println(res);
		   
		   

			
	}
	
	
	

}
