package CurdOperationsOn_List_Set_Map;

import java.util.*;

public class SetCurdOperations {
	
	static HashSet removeOperation(int r,HashSet hs)   //remove operation in set is used just for learning purose.
	{
		hs.remove(r);
		
		return  hs;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> hs = new HashSet<Integer>();
		
		System.out.println("please number of elements you want:");
		
		int n = sc.nextInt();
		
		System.out.println("please enter "+n+" values:");
		
		for(int i=0;i<n;i++)
		{
			int k = sc.nextInt();
			
			hs.add(k);
		}
		
		System.out.println("please enter '1' if you want to remove any element in your set if not '0':");
		
		int num = sc.nextInt();
		
		if(n==1)
		{
			System.out.println("enter the value of your set that you want to remove:");
			
			int r = sc.nextInt();
			
			HashSet hash = removeOperation(r,(HashSet) hs);
			
			for(Object p : hash)
			{
				System.out.println(p);
			}
			
		}
		else
		{
		
		  System.out.println("Unique values are:");
		
		for (int u : hs)
		{
			 System.out.print(u+" ");
		}
		
		}
	}

}
