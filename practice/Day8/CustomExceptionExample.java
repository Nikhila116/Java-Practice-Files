package Day8;

import java.util.*;

class InvalidAgeInputException extends RuntimeException
{
	
	public InvalidAgeInputException()
	{
		super();
	}
	
	public InvalidAgeInputException(String s)
	{
		super(s);
	}
	
	/*public InvalidAgeInputException(String s,int n)
	{
		super(s,n);
	}*/
	
	
}
public class CustomExceptionExample {
	
	static  void AgeChecker(int n) throws InvalidAgeInputException
	{
		if(n < 18)
		{
			throw new InvalidAgeInputException("Entered age is not applicable you need to be greater than 18 years to cast your vote.\n");
		}
		
		else if(n < 0 )
		{
			throw new InvalidAgeInputException("Age can't be in negative.\n");
			
		}
		
		else if(n > 100)
		{
			throw new InvalidAgeInputException();
		}
		
		
		else
		{
			System.out.println("Entered Age accepted cast your voting!\n");
		}
	}
	
	static void ageCorrector()
	{
		System.out.println("Kindly please enter your correct age:\n");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = false;
		//System.out.println("please enter your age:");
		
		while(!check)
		{
			
			ageCorrector();
			
			try
			{
			   int a = Integer.parseInt(sc.nextLine());
			   
				AgeChecker(a);
				
				check = true;
				
				
			}
			
			catch(InvalidAgeInputException i)
			{
			   System.out.println(i);
				
			}
			
		}
				
	}

}
