package Day9;

interface A
{
	void msg();
}

public class AnonymousInterfaceExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 A a = new A()
			{

				@Override
				public void msg() {
					// TODO Auto-generated method stub
					System.out.println("calling overriden method of interface anonymously");
					
				}

			};
		
		a.msg();
		
	}
		

	

}
