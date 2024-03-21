package excercise2;

class base
{
	void display() {
		System.out.println("this is a base class");
	}
}

class derived extends base
{
	void show()
	{
		System.out.println("this is derived class");
	}
}

public class check2  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*base obj = new base();
		obj.display();*/            //supported
		
		/*base obj1 = new derived(); //supported
		obj1.display();*/
		
		/*base obj2 = new derived(); //unsupported
		obj2.show();*/
		
		/*derived obj1 = new base();   //not supported
		obj1.show();*/
		
	    derived obj = new derived();    //supported
		obj.show();
		obj.display();
		
	}

}
