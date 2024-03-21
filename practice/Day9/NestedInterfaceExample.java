package Day9;

interface interfaceOuter
{
	interface Inner
	{
		void msg();
		
	}
}

public class NestedInterfaceExample implements interfaceOuter.Inner{
	
	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("This is an nested interface");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 interfaceOuter.Inner oi = new  NestedInterfaceExample();
		 
		 oi.msg();

	}

	

}
