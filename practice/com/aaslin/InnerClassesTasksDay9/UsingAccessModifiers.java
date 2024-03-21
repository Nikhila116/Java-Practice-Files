//all the access specifiers related errors are provided in the notepad.

package com.aaslin.InnerClassesTasksDay9;

   class Outer1
{
	int a =10;
	
	/*static*/ class Inner1
	{
		void Message()
		{
			System.out.println("This is <Inner1> Class <Message> Method");
		}
		
	}
}

public class UsingAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer1 o = new Outer1();
		
		System.out.println("Value in Outer1 class is : "+o.a);
		
	/*	Outer1.Inner1 oi = new Outer1.Inner1(); //If inner class is static then this is allowed */
		
		Outer1.Inner1 oi = new Outer1(). new Inner1();
		
		oi.Message();

	}

}
