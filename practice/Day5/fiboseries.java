package Day5;

import java.util.Scanner;

public class fiboseries {
	
	 public int fib(int n)
	{
		 if(n==0)
		 {
			 return 0;
		 }
		 else if(n==1)
		 {
			 return 1;
		 }
		 else
		 {
			 return fib(n-1)+fib(n-2);
		 }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the positive value:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fiboseries fb = new fiboseries();
		
		for(int i=0;i<n;i++)
		{
			System.out.println(fb.fib(i));
		}
		
		
				

	}


}
