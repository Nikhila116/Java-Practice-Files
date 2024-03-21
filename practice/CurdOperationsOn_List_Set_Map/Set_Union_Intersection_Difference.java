package CurdOperationsOn_List_Set_Map;

import java.util.*;

public class Set_Union_Intersection_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> hs1 = new HashSet<Integer>();
		
		hs1.addAll(Arrays.asList( new Integer[]
				{1,3,2,4,5,6,7,8,4,56,7,878,78}));
		
		
		Set<Integer> hs2 = new HashSet<Integer>();
		
		hs2.addAll(Arrays.asList(new Integer[]
				{5,2,3,5,7,8,9,1,11,2,3,23,45,}));
		
		
		
		
		//union  --- addAll()
		Set<Integer> union = new HashSet<Integer>(hs1);
		
		 union.addAll(hs1);
		
		System.out.println("union of 2 sets is: "+union);
		
	      
		
		
		//intersection ---- retainAll()
		Set<Integer> intersection = new HashSet<Integer>(hs1);
		
		intersection.retainAll(hs2);
		
		System.out.println("intersection of 2 sets is: "+intersection);
		
		
		
		//difference ---- removeAll()
		Set<Integer> diff = new HashSet<Integer>(hs1);
		
		diff.removeAll(hs2);
		
		System.out.println("Difference of 2 sets is: "+diff);//

	}

}
