//Example of Simple Inner Example.

package com.aaslin.InnerClassesTasksDay9;

class Outer
{
	void DisplayMessage()
	{
		//System.out.println("This is an Outer Class Method");
		
		class Inner
		{
			void InvokeInnerClassMethod()
			{
				System.out.println("This is an Inner Class Method");
			}
			
		}
		
		Inner i = new Inner();
		
		i.InvokeInnerClassMethod();
		
	}
}

public class SimpleInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o = new Outer();
		
		o.DisplayMessage();

	}

}
