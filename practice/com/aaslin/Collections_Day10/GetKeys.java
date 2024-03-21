package com.aaslin.Collections_Day10;

import java.util.HashMap;
import java.util.Map;

public class GetKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Map<Integer,String> m = new HashMap<Integer,String>();
		
        m.put(new Integer(515002),"Alamuru");
		
		m.put(new Integer(531082),"Bhimavaram");
		
		m.put(new Integer(531173),"Chinnamusidiwada");
		
		m.put(new Integer(530029),"DurgaNagar");
		
		m.put(new Integer(530046),"Duvvada");
		
		m.put(1, "nikhila");
		
		m.put(2, "nikki");
		
		System.out.println("keys are:");
		
		for(Map.Entry me: m.entrySet())
		{
			int keys = (int) me.getKey();
			
			System.out.println(keys);
		}
	}

}
