package Day5;

import java.util.Scanner;

import java.util.*;

public class FibonnaciSeries 
{
	static int n1=0, n2=1, n3;
	static void fib1()
	{
		System.out.println(FibonnaciSeries .n1+"\n"+FibonnaciSeries .n2);
	}
	
	 static void fib(int count)
	{
		if(count-2 > 0)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
			fib(count-1);
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner obj = new Scanner(System.in);
		int count = obj.nextInt();
		if(count == 0)
		{
		System.out.println(FibonnaciSeries .n1);
		}
		else if(count == 1)
		{
			System.out.println(FibonnaciSeries .n1+"\n"+FibonnaciSeries .n2);
		}
		else {
		FibonnaciSeries.fib1();
		FibonnaciSeries.fib(count);
		}
		
	}
	
	
}
	

