//2c) Write a Java program to retrieve an element (at a specified index) from a given array list

package com.aaslin.Collections_Day10;

import java.util.*;

public class RetrievingAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the number of elements required in your list:");
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			
			al.add(s);
			
		}
		
		int x = (int) Math.floor(Math.random()*5+1);   // a random element
		
		System.out.println("element at specified index:");
		
		  String s =(String) al.get(x);
		  
		  System.out.println(s);
		  
		 /* System.out.println("REVERSED:");
		  
		  Collections.reverse(al);
		
		  System.out.println(al);*/
		

	}

}
