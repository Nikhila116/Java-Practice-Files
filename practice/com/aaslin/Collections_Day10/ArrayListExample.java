//1. Write a Java program to create a new array list, add some elements (string) and print out the collection

package com.aaslin.Collections_Day10;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		List<String> al = new ArrayList<String>();
		
		System.out.println("please enter the number of elements you required:");
		
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" Strings:");
		
		for(int i=0 ; i<n ;i++)
		{
			String s = sc.next();
			
			al.add(s);
			
		}
		
		System.out.println("\nYour array list has:");
		
		for(String str : al)
		{
			System.out.println(str);
		}
		

	}

}
