//Performing cube of a number.

package com.aaslin.InnerClassesTasksDay9;

import java.util.Scanner;

class OuterClass
{
	void OuterClassMethod(int n)
	{
		class InnerClass
		{
			void CubeOfNumber(int n)
			{
				int c = n*n*n;
				
				System.out.println("Cube of "+n+" is: "+c);
			}
		}
		
		InnerClass ic = new InnerClass();
		
		ic.CubeOfNumber(n);
	}
}

public class Local_InnerClass {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number that you wanted to perform cube operation :");
		
		int n = s.nextInt();
		
		OuterClass o = new OuterClass();
		
		o.OuterClassMethod(n);
		
		
	}

}
