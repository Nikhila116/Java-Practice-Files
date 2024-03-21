//Anonymous Inner Class : performing calculator operation(+,-,*,/)

package com.aaslin.InnerClassesTasksDay9;

import java.util.*;

abstract class Anonymous
{
	abstract void acceptOperations(String operation,int a,int b);
	
}

public class AnonymousInnerClassesArithmeticOperations {
	
	static void ExceptionCase()
	{
		System.out.println("\nZERO not accepted for division ,please enter a positive value for division.\n");
		
	}
	
	//class DoOperations
			//{
		     static Anonymous an = new Anonymous()
			{
				public void acceptOperations(String operation,int a,int b)
				
				{
					
				switch(operation)
				
				{
				
				case "add":
					int c;
					c = a+b;
					System.out.println("\n"+a+" added to "+c+" is "+c); 
					break;
					
					
				case "sub":
					int s;
					s = a-b;
					System.out.println("\n"+a+" subtracted to "+b+" is "+s); 
					break;
					
					
				case "mul":
					int m;
					m = a*b;
					System.out.println("\n"+a+" multiplied to "+b+" is "+m); 
					break;
					
					
				case "div":
					int d;
					
					boolean isvalid = false;
					
					
					try
					{
						while(!isvalid)
						{
						d = a/b;
						
						isvalid = true;
						
						System.out.println("\n"+a+" divide to "+b+" is "+d); 
						}
					}
					
					catch(Exception e)
					{
						
						ExceptionCase();
						
						Scanner sc = new Scanner(System.in);
						
						System.out.println("please give your input1: ");
						
						int i1 = sc.nextInt();
						
						System.out.println("please give your input2: ");
						
						int i2 = sc.nextInt();
						
						System.out.println("please enter your required operation: ");
						
						String str1 = sc.next();
						
						acceptOperations(str1,i1,i2);
						
						}
					
					break;
					
				default :
					System.out.println("please enter the options as per the requirement add , sub , mul and div only !!");	
				}
				
			}
			
		};
	//}	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		    Scanner s = new Scanner(System.in);
		 
		    System.out.println("please give your input1: ");
			
			int a = s.nextInt();
			
			System.out.println("please give your input2: ");
			
			int b = s.nextInt();
			
			System.out.println("please enter your required operation: ");
			
			String str1 = s.next();
			
			StringBuilder str = new StringBuilder();
			
			str.append(str1);
			
			/*AnonymousInnerClassesArithmeticOperations.DoOperations ad = new AnonymousInnerClassesArithmeticOperations().new DoOperations();
			
			ad.an.acceptOperations(str1,a,b);*/  //oneway of accessing the method
			
			
			/*AnonymousInnerClassesArithmeticOperations ad = new AnonymousInnerClassesArithmeticOperations();
			
			ad.an.acceptOperations(str1,a,b);*/  //another way of accessing the method
			
			an.acceptOperations(str1,a,b);
			
		

	}

}
