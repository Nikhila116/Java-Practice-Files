package excercise1;

public class check {
	
	public static void main(String args[]) {
		
		String s = "nikhila";
		
		String s1 = new String("nikhila");     //intern()
		
		
		if(s==s1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
//		System.out.println(s.equals(s1));
		
	}

}
