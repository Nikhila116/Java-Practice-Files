
public class ExceptionPropagation {
	
	void sample()
	{
		int a=10;
		int b=0;
		System.out.println(a/b);
	}
	
	void sample1()
	{
		sample();
	}
	
	void sample2()
	{ 
		try {
		sample1();
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagation ep = new ExceptionPropagation();
				ep.sample2();
		
		System.out.println("running");

	}

}
