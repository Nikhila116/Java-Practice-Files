package Day5;

import java.io.*;

import java.util.Scanner;

public class PrimeOrNot {
	
	
	int c = 0;
	
	public void primeOrNot(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
		 if(n%i==0)
		{
			c++;
		}
		}
		
		if(c==2)
		{
			System.out.println(n+" prime number");
		}
		else
		{
			System.out.println(n+" not a prime number ");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter a number:");
		
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		
		PrimeOrNot p = new PrimeOrNot();
		
		 p.primeOrNot(n);

	}

	

}
