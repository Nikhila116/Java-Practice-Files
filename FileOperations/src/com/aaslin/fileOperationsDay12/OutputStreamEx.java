package com.aaslin.fileOperationsDay12;

//import org.omg.CORBA.portable.OutputStream;

import java.io.*;

public class OutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OutputStream o = System.out;
		
		o.write()*/
		
		try(OutputStreamWriter osw = new OutputStreamWriter(System.out))
		{
			osw.write("write something you like");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
