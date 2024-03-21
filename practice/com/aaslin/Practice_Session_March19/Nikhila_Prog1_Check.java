package com.aaslin.Practice_Session_March19;

import java.util.*;

import java.util.Arrays;

public class Nikhila_Prog1_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the size of an array:");
		
		int n =sc.nextInt();
		
		int []a = new int[n];
		
		for(int i=0;i<n;i++)
		{
		   a[i]=sc.nextInt();
			
		}
		
		System.out.println("enter new size:");
		
		int new_size = sc.nextInt();
		
		a = Arrays.copyOf(a, n+new_size);
		
		for(int i=n;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();		
		}
		
		for(int v : a)
		{
			System.out.println(v);
		}
		
		
		
		

	}

}
