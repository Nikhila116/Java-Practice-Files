//Nested Interface.

package com.aaslin.InnerClassesTasksDay9;

interface Shape
{
	interface Drawable
	{
		void draw();
		
	}
}



public class NestedInterfaceExample {
	
	class Circle implements Shape.Drawable
	{
		public void draw()
		{
			System.out.println("This is a Circle class");
			
		}
		
	}
	class Rectangle implements Shape.Drawable
	{
		public void draw()
		{
			System.out.println("This is a Rectangle Class");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape.Drawable sdc = new NestedInterfaceExample(). new Circle();
		
		Shape.Drawable sdr = new NestedInterfaceExample(). new Rectangle();
		
		sdc.draw();
		
		sdr.draw();
		
	}

}
