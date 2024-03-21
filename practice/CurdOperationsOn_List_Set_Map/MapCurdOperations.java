package CurdOperationsOn_List_Set_Map;

import java.util.*;

public class MapCurdOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> m = new HashMap<Integer,String>();   //creating
		
		m.put(new Integer(515002),"Alamuru");
		
		m.put(new Integer(531082),"Bhimavaram");
		
		m.put(new Integer(531173),"Chinnamusidiwada");
		
		m.put(new Integer(530029),"DurgaNagar");
		
		m.put(new Integer(530046),"DurgaNagar");
		
		m.remove(530029);  //removing one map entry 
		
		String s ="Duvvada";    //updating one map entry
		
		m.put(530046,s);
		
		
		
		System.out.println("ZipCodes and Cities:");
		
		for(Map.Entry e : m.entrySet())      //retriving
		{
			int key = (int)e.getKey();
			
			String value = (String)e.getValue();
			
			System.out.println(key +" : "+ value);
		}

	}

}
