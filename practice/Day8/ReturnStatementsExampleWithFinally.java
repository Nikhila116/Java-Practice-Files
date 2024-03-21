package Day8;
import java.util.*;

public class ReturnStatementsExampleWithFinally {


	@SuppressWarnings("finally")
	public  int divide(int a,int b)
	{
	   
		try 
		{
		//System.out.println("I'm in try block");
		int c ;
		
		c=a/b;
		
		//return c;
		System.out.println("I'm in try block");
		
	    }
	
	catch(ArithmeticException e)
	{
		System.out.println("I'm in catch block "+e);
		
		return 1;
	   		
	}
		
		finally
		{
			System.out.println("I'm in finally block");
			
			return a/b;
		}
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ReturnStatementsExampleWithFinally r = new ReturnStatementsExampleWithFinally();
		
		
	System.out.println("please enter an integer1:");
		
			int a = sc.nextInt();
			
    System.out.println("please enter an integer2:");
			
			int b = sc.nextInt();
			
			int d = r.divide(a,b);
			
			System.out.println(d);
			
	

	}

}
