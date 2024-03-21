package com.aaslin.fileOperationsDay12;

import java.io.IOException;

import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter fw = new FileWriter("D:\\FileOperations\\file.txt",true))  //boolean value to append the given content to that file
		{
			fw.write("\nThis is a file writer example");  //flush the complete file content and replace with this
			
			
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
