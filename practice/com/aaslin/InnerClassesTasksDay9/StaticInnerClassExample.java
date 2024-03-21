//StaticInnerClassExample for Factorial of a number using Recursion.

package com.aaslin.InnerClassesTasksDay9;

import java.util.*;

//import com.aaslin.InnerClassesTasksDay9.OuterStatic.Inner;

class OuterStatic
{
	static class Inner
	{
		static int CalculateFactorial(int n)
		{
			
			if(n>1)
			{
			 return n*CalculateFactorial(n-1);
			}
			else
			{
				return 1;
			}
			
		}
	}
	
}

public class StaticInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
	    System.out.println("please enter a value:");
		
		int n = s.nextInt();
		
		 OuterStatic.Inner oi = new  OuterStatic.Inner();
		 
		 int res = oi.CalculateFactorial(n);
		 
		 System.out.println("The factorial of "+ n +" is "+res);

	}

}
