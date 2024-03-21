//3, c) Write a Java program to Find maximum element in ArrayList
package com.aaslin.Collections_Day10;

import java.util.*;

public class MaxEle {
	
	public static void max(List al,int n)
	{
		int max = (int) al.get(0);
		
		for(int i=1;i<n;i++)
		{
			if( (int) al.get(i) > max )
			{
				max = (int) al.get(i);
				
			}
		}
		
		System.out.println("Maximum element in the list is:"+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> al = new ArrayList<Integer>();
		
		System.out.println("please enter no.of elements");
		
		int n = sc.nextInt();
		
		System.out.println("please enter the numbers");
		
		for(int i=0;i<n;i++)
		{
			int read = sc.nextInt();
			
			al.add(read);
			
		}
		
		max(al,n);
			
		
		

	}

}
