package WeekendWorkDay6;

import java.util.*;

public class AfterHashStrings {


	static Iterator func(ArrayList al)
	{
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
		Object e = it.next();
		
		if(e == "###")
		{
			break;
			
		}
		
		}
		
		
		return it;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		
		//Iterator it = al.iterator();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter number of positive integers you required before ###: ");
		
		int n = sc.nextInt();
		
		for(int i = 0;i <  n;i++)
		{
			int a = sc.nextInt();
			
			al.add(a);
			
		}
		
		al.add("###");
		
		System.out.println("please enter the number of strings you required after ###: ");
		
		int m = sc.nextInt();
		
		for(int i = 0;i < m;i++)
		{
			String s = sc.next();
			
			al.add(s);
		}
		
	//	System.out.println(func(al));
		
		Iterator it = func(al);
		
		System.out.println("Strings after ### are:");
		
		while(it.hasNext())
		{
			Object ele = it.next();
			
			System.out.println((String)ele);
			
		}
				
				

	}

}
