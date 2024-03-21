package com.aaslin.FileOperations_Assignment;

import java.io.*;

public class FrequencyOfWords {
	
	 String InputFile = "input.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String InputFile = "input.txt";
		
		String OutputFile ="word_frequencies.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(InputFile));  //reads the data from the input file
				BufferedWriter bw = new BufferedWriter(new FileWriter(OutputFile))) // writes the data to the output file
		{
			
			int countFrequency[] = new int[256];
			
			String line;
			
			while((line=br.readLine()) != null)
			{
				String words[] = line.split("\\s+");     //it splits the words using a delimiter "space"
				
				for(String word : words)
				{
					
					
					word = word.toLowerCase().replaceAll("[^a-zA-Z]", ""); //word to lower case and removes all non alphabetical characters
					
					
					if(!word.isEmpty())
					{
						int index = Math.abs(word.hashCode())%countFrequency.length; //hash code may return negative values so math.abs is manditatory

						countFrequency[index]++;
						
					}
					
					
				}
				
				
			}
			
			
			for(int i=countFrequency.length-1 ; i>=0 ; i--)
				
			{
				if(countFrequency[i]>0)
					
				{
					
					bw.write(i + ":" + countFrequency[i]);
					
					
					bw.newLine();
					
				}
			}
			
			System.out.println("Frequency written to:"+OutputFile);
			
			
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
			
			
		}

	}

}
