package WeekendWorkDay6;

import java.util.*;

public class MyCalculator {
	
	void  Longpower(int n,int p) throws Exception
	{
		if(n>0 && p>0) {
			
			int res = (int) Math.pow(n,p);
			
			System.out.println(res);
			
			}
			
			else if(n==0 || p==0)
			{
				throw new Exception("n and p should not be zero.");
			}
			
			else
			{
				throw new Exception("n or p should not be negative.");
			}
			
		
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		MyCalculator mc = new MyCalculator();
		
		
		int n = sc.nextInt();
		
		int p = sc.nextInt();
		
		 mc.Longpower(n,p);
		
		

	}

}
