package Day4;

import java.io.NotActiveException;

abstract class AbstractionExample1{
	
	abstract void a1();
	
	abstract void a2();
	
	void a3()
	{
		System.out.println("This is normal method");
	}
	
	
}

abstract class AbstractionExample2{
	
	abstract void a1();
	
	abstract void a2();
	
	void a3()
	{
		System.out.println("This is a normal method");
	}
	
}

 class AbstractionExample extends  AbstractionExample1/*,AbstractionExample2*/{
	
	
	void a1()
	{
		System.out.println("abstract method 1");
		
	}
	
	public static void main(String args[])
	{
		 AbstractionExample a = new  AbstractionExample();
		
		 a.a1();
		 a.a3();
		
		
	}

	@Override
	void a2() {
		// TODO Auto-generated method stub
		
	}

}
