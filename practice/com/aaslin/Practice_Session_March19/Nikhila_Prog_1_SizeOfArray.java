package com.aaslin.Practice_Session_March19;

import java.util.*;

public class Nikhila_Prog_1_SizeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int increase = 0;

		int size = 0;

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// increase += n;
		System.out.println("To how much value you want to increase the size:");

		increase = sc.nextInt();

		size = n + increase;

		System.out.println("increase:" + increase);

		System.out.println("size:" + size);
		
		int a1[] = new int[size];
		
		for(int i=0;i<n;i++)
		{
			a1[i] = a[i];
		}

		for (int k = n; k < size; k++) {

			a1[k] = sc.nextInt();

		}

		for (int i = 0; i < size; i++) {
			System.out.println(a1[i]);
		}

	}

}
