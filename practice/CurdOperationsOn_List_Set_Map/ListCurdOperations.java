package CurdOperationsOn_List_Set_Map;

import java.util.*;

public class ListCurdOperations {
	
	static List DeleteItemInList(int p,List l)
	{
		
		
		l.remove(p);
		//System.out.println("Updated Groceries list is:");
		
		return l;
	}
	
	static List Updating(List l,int value,String updatedvalue)
	{
		l.set(value, updatedvalue);
		
		return l;
		
	}
	
	static void returning(List l)
	{
		System.out.println("\n your Final list of groceries are:");
		
		for(Object st : l)
		{
			System.out.println(st);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the no.of Groceries you wanted in your list:");
		
		int n = s.nextInt();
		
		List<String> l = new  ArrayList<String>();
		
		for(int i = 0;i <=n;i++)
		{
			String str = s.nextLine();
			
			l.add(str);
			
			
		}
		
		System.out.println("If you would like to remove any of the item in your list please enter '0'");
		
		System.out.println("If you would like to replace any of the item with current item in your list please enter '1'");
		
		System.out.println("If no change then press '5'");
		
		int num = s.nextInt();
		
		try 
		{
		
		if(num == 0)
		{
			System.out.println("please enter the serial number of the item  you wanted to delete:");
			
			int p =s.nextInt();
			
			List m=DeleteItemInList(p,l);
			
			System.out.println("\nyour groceries list after updation is:");
			
			for(Object k : m)
			{
				System.out.println(k);
			}
			
		}
		   
		
		
		else if(num == 1)
		{
			System.out.println("please enter the serial number of the item you want to replace with:");
		
			int value = s.nextInt();
			
			System.out.println("please enter the new item:");
			
			String updatedvalue = s.next();
			
			List m = Updating(l,value,updatedvalue);
			
           System.out.println("\nyour groceries list after updating:");
			
			for(Object k : m)
			{
				System.out.println(k);
			}
			
			

		}
		
		else
		{
			returning(l);
		}
	}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}	

}
	