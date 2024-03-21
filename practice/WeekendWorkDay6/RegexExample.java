package WeekendWorkDay6;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexExample {
	
	public static void main(String[] args)
	
{
		
		Scanner s = new Scanner(System.in);   
		
		int n = s.nextInt();
		String str;
		
		s.nextLine();
		
		for(int i=0;i<n;i++)
		{
		   str = s.nextLine();
		
		   
		   if(regex(str))
		   {
			   System.out.println("valid");
			   
		   }
		   else
		   {
			   System.out.println("invalid");
		   }
		}
	
			
		}

	private static boolean regex(String str) {
		// TODO Auto-generated method stub
		
		try {
		
		Pattern.compile(str);    //Pattern is a class Compile is method in Pattern class checks whether the given pattern match's the actual format of regex.
		return true;
		}
		catch(PatternSyntaxException e)
		{
		return false;
		}
	}
		
		
		
	}


