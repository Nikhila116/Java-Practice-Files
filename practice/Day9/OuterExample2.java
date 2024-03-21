package Day9;

//if a method has class inside it then it is called local inner class.

public class OuterExample2 {
	
	void innerMethod()
	{
		class Inner
		{
			   
			void Message()
			{
				System.out.println("Local Inner class");
			}
			
			
		}
		
		Inner inner = new Inner();
		inner.Message();
		
		System.out.println("This is a method inside a class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterExample2 o = new OuterExample2();
		 o.innerMethod();

	}

}
