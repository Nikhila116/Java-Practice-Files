package Day5;

import java.util.Scanner;

public class PalindromeOrNOt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("please enter a string:");
		
		Scanner obj = new Scanner(System.in);
		
		String n = obj.nextLine();
		
		//String s = "nikhila";
		
	    int l = n.length();
		int i;
		int c=0;
		
		
		
		for(i=0;i<l/2;i++) 
		{
			if(n.charAt(i) == n.charAt(l-i-1))
			{
				c++;
			}
			
		}
		
		if(c==l/2)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("no");
		}
			

	}

}
