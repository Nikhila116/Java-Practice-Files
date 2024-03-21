/*3. Write a Java program that reads a text file named "input.txt" 
and reverses the order of characters in each line.
Write the modified text to another file named "reversed.txt". 
Ensure that your program handles file IO exceptions and empty lines gracefully.*/

package com.aaslin.FileOperations_Assignment;

import java.io.*;

import java.util.*;

public class ReversedLine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("Reversed.txt");
		
		f.createNewFile();
		
		try(BufferedReader br = new BufferedReader(new FileReader("input.txt"));
				
				BufferedWriter bw = new BufferedWriter(new FileWriter("Reversed.txt"))) 
		{
			List<String> al = new ArrayList<String>();
			
			String line;
			
			while((line = br.readLine()) != null)
			{
			   if(!line.isEmpty())
			   {
				   StringBuilder sb = new StringBuilder(line);
				   
				   al.add(sb.reverse().toString());
			   }
			}
			
			//System.out.println(al);
			
			for(String s : al)
			{
				bw.write(s);
				
				bw.newLine();
			}
			
			System.out.println("reversed line successfully inserted into reversed text file.");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
