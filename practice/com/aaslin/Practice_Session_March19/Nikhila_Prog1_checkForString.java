package com.aaslin.Practice_Session_March19;

import java.util.*;

import java.util.Arrays;

public class Nikhila_Prog1_checkForString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the size of a String array:");

		int n = sc.nextInt();

		String[] a = new String[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.next();

		}

		System.out.println("enter new size:");

		int new_size = sc.nextInt();

		a = Arrays.copyOf(a, n + new_size);  //method to resize the array without creating any new array.

		for (int i = n; i < a.length; i++) {

			a[i] = sc.next();
		}

		for (String v : a) {
			System.out.println(v);
		}

	}

}
