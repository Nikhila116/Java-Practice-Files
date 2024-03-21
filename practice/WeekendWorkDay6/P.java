package WeekendWorkDay6;

import java.util.*;

public class P{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int k = 0;
		
		Scanner sc = new Scanner(System.in);
		
		PrimeNumbers p = new PrimeNumbers();
		
		System.out.println("Please enter no.of integers:");
		
		int n = sc.nextInt();
		
		int temp =n;
		
		int []arr = new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter integer "+(i+1));
			
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			p.checkPrime(arr,i);
		}
			
	}
		
		
	
	void checkPrime(int[] arr,int index)
	{
		int count = 0;
		
		for(int i=2;i<=arr[index]/2;i++)
			
		{
			
			 if(arr[index]%i == 0)
				 
			{
				count = 1;
				break;
				
			}
		}
			
		    if(count == 0)
			
		{
		    	/*int []arr1= new int[k+1];
		    	
		    	for(int i=0;i<=k;i++)
		    	{
		    	    arr1[i]=n;
		    		System.out.println(arr1[i]);
		    	}*/
		    	
		    	for(int j=0;j<=index;j++) 
		    	{
		    	
		    	System.out.print(arr[j]+" ");
		    	}
		    	
		    	System.out.println();
		}
		
 
        
	}
	
}


