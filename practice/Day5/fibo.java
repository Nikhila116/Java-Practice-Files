package Day5;

//nth fibonacci digit

import java.util.Scanner;

public class fibo {
	
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
		fibo f = new fibo();
		int r =f.fib(n);
		System.out.println(r);
		
		
				

	}

}
