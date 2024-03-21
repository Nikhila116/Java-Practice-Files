package Day8;

import java.util.*;

class A
{
	 int divide(int numb1,int numb2)
	{
		int res = numb1/numb2;
		
		return res;
		
	}
}

class B extends A
{
	
	
}

class C extends  B
{
	
		int divide1(int numb1,int numb2) throws ArithmeticException
		{
			int res = 0;
			
			try
			{
		     res = divide(numb1,numb2);
			
			}
			
			catch(ArithmeticException e )
			
			{
				System.out.println("Exception handled here "+e.toString());
			}
			
			return res;
		}
		
}
	


public class ExceptionPropogationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 C c = new C();
		 
		 Scanner s = new Scanner(System.in);
		 
		 int a = s.nextInt();
		 
		 int b = s.nextInt();
		 
		 int r =c.divide1(a, b);
		 
		 System.out.println(r);
		

	}

}
