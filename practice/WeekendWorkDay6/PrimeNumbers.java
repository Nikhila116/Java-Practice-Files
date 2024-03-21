package WeekendWorkDay6;

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int k = 0;
		
		Scanner sc = new Scanner(System.in);
		
		PrimeNumbers p = new PrimeNumbers();
		
		System.out.println("Please enter no.of integers:");
		
		int n = sc.nextInt();
		
		int []arr = new int[n];
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter integer "+(i));
			
			arr[i-1]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			p.checkPrime(arr[i],i,arr);
		}
			
	}
	
	public void checkPrime(int n,int index,int []arr)
	{
		boolean c = false;
		
		int nsqrt = (int) Math.sqrt(n);
		
		for(int k=2;k<=nsqrt;k++)
		{
			if(n%k==0)
			{
				c = true;
				break;
			}
			
		
		}
		//System.out.println(index);
		
		if(n == 0 || n == 1)
		{
			c = true;
		}
		
		if(c == false)
		{
			for(int i=0;i<=index;i++)
			{
				//System.out.print(n);
				
				int []arr1 = new int[index+1];
				
				arr1[index] = n;
				
				System.out.print(arr[index]);
				
				
			}
			
			System.out.println();
			
		}
		
	}

	public void checkPrime(int[] arr, int i) {
		// TODO Auto-generated method stub
		
	}
}
		
		
	
	