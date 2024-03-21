/*2. Create a Java program that concatenates the contents of two text files, 
"file1.txt" and "file2.txt", into a new file named "concatenated.txt". 
Make sure to handle file not found exceptions and any other relevant IO exceptions.*/

package com.aaslin.FileOperations_Assignment;

import java.io.*;
import java.io.IOException;

public class ConcatenationOfTwoFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		concatenateFiles();
		System.out.println("2 files concatenated successfully");
		

	}

	private static void concatenateFiles() {
		// TODO Auto-generated method stub
		try {
		BufferedReader br = new BufferedReader(new FileReader("D:\\work space\\FileOperations\\input.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("D:\\work space\\FileOperations\\wordFrequency.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\work space\\FileOperations\\concatenated.txt"));
		
		String line;
		
		while((line = br.readLine()) != null)
		{
			bw.write(line);
			
			bw.newLine();
		}
		
		while((line = br1.readLine()) != null)
		{
			bw.write(line);
			bw.newLine();
		}
		
		br.close();
		br1.close();
		bw.close();
		
		
	}
		catch(IOException io)
		{
			System.out.println(io.getMessage());
		}

}
	
	
	
}
