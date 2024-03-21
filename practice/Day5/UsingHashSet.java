package Day5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class UsingHashSet {
	

	static HashSet<Character> o = new HashSet<Character>();
	
	  static int  add(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			o.add(str.charAt(i));
		}
		
		return o.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner obj = new Scanner(System.in);
		String s = "nikhila";
//		UsingHashSet u = new UsingHashSet();
//		u.add(s);
	
		System.out.println(add(s));
		
		for(char e : o)
		{
			System.out.println(e);
		}
		
		
	

	}

}
