
import java.util.*;
public class ExceptionHandling {
	String name;

	public ExceptionHandling(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		//System.out.println(name);
	}
	
	public static void main(String[] args) 
	{	try {
		
		Scanner o = new Scanner(System.in);
		int a = o.nextInt();
		int b = o.nextInt();
		
		int c = a/b;
		
		System.out.println(c);
		
			
		}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		System.out.println("end of the code");
		ExceptionHandling eh = new  ExceptionHandling("nikhila");
		System.out.println(eh.name);
	}
		
		
	}

	
}