//8. Write a Java program to compare two sets and retain elements which are same on both sets
package com.aaslin.Collections_Day10;

import java.util.*;

public class CommonElementsInBothSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> s1 = new HashSet<Integer>();
		
		Set<Integer> s2 = new HashSet<Integer>();
		
		System.out.println("Enter the no.of items required in set1:");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the numbers in the set1:");
		
		for(int i =0;i<n;i++)
		{
			int input1 = sc.nextInt();
			
			s1.add(input1);
			
		}
		
       System.out.println("Enter the no.of items required in set2:");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter the numbers in the set2:");
		
		for(int i =0;i<n1;i++)
		{
			int input2 = sc.nextInt();
			
			s2.add(input2);
			
		}
		
		//Set<Integer> s = new HashSet<Integer>(s1);
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int e : s1)
		{
			if(s2.contains(e))
			{
				s.add(e);
			}
		}
		
		System.out.println("Retriveing common elements in both sets:");
		
		for(int e1: s)
		{
			System.out.println("\t"+e1);
		}
		
		/*s.retainAll(s2);
		
		System.out.println(s);*/
		

	}

}
