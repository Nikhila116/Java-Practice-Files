//3. a) Write a Java program to reverse elements in a array list

package com.aaslin.Collections_Day10;

import java.util.*;

public class ReversingOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List al = new ArrayList ();
		
		System.out.println("please enter the required number of items into the list:");
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			
			al.add(s);
		}
		
		Collections.reverse(al);
		
		Print(al);
		
		
	}

	private static void Print(List al) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
		}
		
	}

	
}
