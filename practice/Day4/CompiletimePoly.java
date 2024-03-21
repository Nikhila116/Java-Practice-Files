package Day4;

//over loading  --- compiletime polymorphism

public class CompiletimePoly {
	
	void cal(int a,int b)
	{
		System.out.println(a*b);
	}
	
	void cal(int a, int b, String s)
	{
		System.out.println(a*b+","+s);
	}
	
	void cal(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompiletimePoly c = new CompiletimePoly();
		
		c.cal(2,3);
		c.cal(2,4,"three parameters");
		c.cal("single parameter");

	}

}
