 //2b) Write a Java program to remove the fifth element from a array list

package com.aaslin.Collections_Day10;

import java.util.*;

public class RemovingElementOfAL {
	
	static List RemoveFifthElement(List a)
	{
		 a.remove(4);
		
		 return a;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inorder to remove fifth element please enter more than 5 items:");
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			
			a.add(s);
			
		}
		
		List l=RemoveFifthElement(a);
		
		System.out.println("\n After Removing Fifth element from the list:");
		
		for(Object ele : l)
		{
			System.out.println(ele);
		}
		
		
		

	}

}
