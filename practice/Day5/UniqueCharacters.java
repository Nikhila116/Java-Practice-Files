package Day5;

import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the text:");
		Scanner obj = new Scanner(System.in);
		String s = obj.nextLine();
		char c;
		int count =0;
		
		for(c='a';c<='z';c++)
		{
			for(int i=0;i<s.length();i++)
			{
			   if(s.charAt(i) == c)
			    {
				   System.out.println(c);
				   count++;
				   break;
				
				
			    }
		    }
		}
		
		System.out.println("No.of unique characters are : "+count);
		
		
		
				

	}

}
