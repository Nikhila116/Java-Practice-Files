// 3,b) Write a Java program to search an element in a array list

//IndexOf(element) ---->    firstOccurence of that element will be given.

//lastIndexOf(element) ----> LastOccurence of that element will be given

//contains(element) -----> returns boolean value based on the exsistance of the element in that list

package com.aaslin.Collections_Day10;

import java.util.*;

public class SearchingOfEle {
	
	public static void CheckingForElement(String s,List l)
	{
		System.out.println(l.contains(s));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		List  l = new ArrayList();
		
		String items;
		
		System.out.println("enter the no.of items:");
		
		int n = sc.nextInt();
		
		System.out.println("please enter the values:");
		
		for(int i=0;i<n;i++)
		{
			items = sc.next();
			
			l.add(items);
			
			
		}
		
		System.out.println("please enter '1' if you want to search for an element in your list:");
		
		int search = sc.nextInt();
		
		
		
		if(search == 1)
		{
			System.out.println("please enter the item you want search in the list:");
			
			String s = sc.next();
			
			CheckingForElement(s,l);
		}
		
		else
		{
			System.out.println("Your List is:");
			
			for(Object e: l)
			{
				System.out.println(e);
			}
		}
		
		
	}

}
