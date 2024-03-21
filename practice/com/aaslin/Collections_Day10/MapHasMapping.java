//5. Write a Java program to test if a map contains a mapping for the specified value

//7. Write a Java program to check whether a HashMap contains a specified Key or not

//obj.containsKey()  ---> <boolean value checks if the key has a mapping or not > ,, or ,,<key even exsists or not>

package com.aaslin.Collections_Day10;

import java.util.*;

public class MapHasMapping {

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
		
		System.out.println(m.containsKey("Duvvada"));
		
		System.out.println(m.containsValue("Duvvada"));  // <value has a key or not> ,, or ,,<even exsist or not>
		
		
		
		
		
		
		
	}

}
