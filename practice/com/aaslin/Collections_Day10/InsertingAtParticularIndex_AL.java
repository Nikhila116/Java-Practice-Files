//2a) Write a Java program to insert an element into the array list at the first position

package com.aaslin.Collections_Day10;

import java.util.*;

public class InsertingAtParticularIndex_AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List al = new ArrayList();
		
		al.add("1");
		
		al.add("The");
		
		al.add("of");
		
		al.add("Tales");
		
		
		al.set(1,"Book");  //adding element at first index.
		
		for(Object a : al)
		{
		
		System.out.println(a);
		
		}
		
		

	}

}
