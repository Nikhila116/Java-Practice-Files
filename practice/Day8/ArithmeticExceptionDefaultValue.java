package Day8;

import java.util.*;

public class ArithmeticExceptionDefaultValue {
	
	static void HandlingArithmeticException(int input1,int input2)
	{
		boolean valid = false;
		
		
			while(!valid)
			{
				
			if(input1>0 && input2>0)
			{
				try {
					
				int res = input1/input2;
				
				valid = true;
				
				System.out.println(res);
				
				}
				catch(Exception e)
				
				{
					
					System.out.println("exception caught");
					
				}
				
			}
			
			
			else if(input1 == 0)
			{
				input1 = 1;
			}
			
			else if(input2 == 0)
			{
				input2 = 1;
			}
		}
			
		}
		
		
			
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean valid = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter input1:");
		
		int a= sc.nextInt();
		
		System.out.println("enter input2:");
		
		int b = sc.nextInt();
		
		HandlingArithmeticException(a,b);
		
		
		
		
		

	}

}
