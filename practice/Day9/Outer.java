package Day9;

public class Outer {
	
	public class Inner{  //no inner class has a static method
		
		void Message()
		{
			System.out.println("It's an Inner class");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o = new Outer();
		Outer.Inner inner = new Outer().new Inner();
		
		new Outer().new Inner().Message();
		
		

	}

}
