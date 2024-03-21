package Day4;

//Basic Example of OverLoading.

public class OverloadingExample {
	
	public int area(int l,int b)
	{
		return (l*b);
	}
	
	public void area(String s, int l,int b)
	{
		
		
	      System.out.println(s+" "+(l*b));
	      
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingExample oe = new OverloadingExample();
		
		int result =oe.area(2, 3);
		
		System.out.println(result);
		
		oe.area("This is the area of rectangle",4,5);

	}

}
