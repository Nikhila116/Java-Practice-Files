package com.aaslin.fileOperationsDay12;

import java.io.*;

//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;

public class InputReader {

	public static void main(String[] args) {
		
		try(InputStreamReader is = new InputStreamReader(System.in))  //takes the input stored in 'is'
		{
			
				int letter = is.read();  //reads one by one
				
				//System.out.println(letter);
				
				while(is.ready())   ///if any more data available or not
				{
					System.out.println((char)letter); //and we are printig here
					
					letter = is.read();   //stores the asci value
				}
				
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		try(FileReader fr = new FileReader("D:\\FileOperations\\file.txt")) //C:\Users\AASLIN-03\FileOperations
		{
			int letter = fr.read();
			
			while(fr.ready())
			{
				System.out.println((char)letter);
				
				letter = fr.read();
			}
			System.out.println((char)letter);
			
			
		
			
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
		
	}
}
