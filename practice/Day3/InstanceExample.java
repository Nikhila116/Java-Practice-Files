//exceptions are arising in this case of newInstance() method of class

package Day3;
 
class A
{
	int a;
}

class B
{
	int b;
}

public class InstanceExample {
	
	public static void func(String c) throws ClassNotFoundException,IllegalAccessException,InstantiationException{
		
		Object obj = Class.forName(c).newInstance();
		
		System.out.println("Object Created for the class"+obj.getClass().getName());
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException,IllegalAccessException,InstantiationException{
 
		func("A");
	}

}

