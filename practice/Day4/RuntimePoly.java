package Day4;

//overriding ----- runtime polymorphism

class Runtime
{
	void show()
	{
		System.out.println("This a show method before overriding");
	}
}

public class RuntimePoly extends Runtime{
	
	@Override
	void show()
	{
		System.out.println("This a show method after overriding");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RuntimePoly r = new RuntimePoly();
		r.show();

	}

}
