package Day9;

public class OuterExample3 {
	
	static class Inner
	{
		//static int x=30;
		/*static*/void m1()
		{
			System.out.println("This is a static Inner class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterExample3.Inner i = new OuterExample3.Inner();
		
		i.m1();
		
		//OuterExample3.Inner.m1();

	}

}
