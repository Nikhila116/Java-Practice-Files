//Nested Inner Classes.

package com.aaslin.InnerClassesTasksDay9;

import java.util.*;

import com.aaslin.InnerClassesTasksDay9.OuterClassEx.InnerClassEx;

class OuterClassEx
{
	String className;
	
	OuterClassEx(String name)
	{
		this.className = name;
		
		System.out.println("It is an "+className+" Method");
		
	}
	
	class InnerClassEx
	{
		 void display(String str)
		{
			System.out.println("It is an "+str+" method invoked by the object created by "+className+" method");
		}
		
	}
	
	InnerClassEx ReturnObject()
	{
		return this.new InnerClassEx();
	}
	
	
}



public class NestedInnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//OuterClassEx.InnerClassEx oi = new OuterClassEx("OuterClass").new InnerClassEx();
		
		OuterClassEx o = new OuterClassEx("OuterClass");  //outer class object 
		
		InnerClassEx i = o.ReturnObject();     //using outerclass object invoking method in outerclass to create an instance for inner class
		
		i.display("InnerClass");    //by using the instance created by above invoking the method in inner class.
		
		
		
		   

	}

}
