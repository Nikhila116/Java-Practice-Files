//4. Write a Java program how to Convert a ArrayList to HashSet

// 1,we can use constructor method

//2,add()

//3,addAll()

//4,Stream

package com.aaslin.Collections_Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class ArrayListToHashSet {

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
		
		Set s = new HashSet();
		
		s.addAll(l);
		
		System.out.println("\nConverted Arraylist values to HashSet items:\n");
		
		for(Object p:s)
		{
			System.out.println(p);
		}

	}

}
