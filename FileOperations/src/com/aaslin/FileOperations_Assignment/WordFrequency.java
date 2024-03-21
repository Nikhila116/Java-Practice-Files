/*1. Write a Java program that reads a text file named "input.txt" and counts 
the frequency of each word in the file. Then, write these word frequencies 
along with the corresponding words to another text file named "word_frequencies.txt", 
sorted in descending order of frequency. Ensure that your program handles file IO exceptions appropriately.*/

package com.aaslin.FileOperations_Assignment;

import java.io.*;
import java.util.*;

public class WordFrequency {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	      String  inputFile = "input1.txt";
	      
	      String outputFile = "wordFrequency.txt";
	      
	      try(BufferedReader br = new BufferedReader(new FileReader(inputFile));
	    		  
	    		  BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile)))
	      {
	    	  
	    	  
	    	  
	    	  Map<String,Integer> m = new HashMap<String,Integer>();
	    	  
	    	  String line;
	    	  
	    	  while((line = br.readLine()) != null)
	    	  {
	    		  String[] words = line.split(" ");
	    		  
	    		  for(String word : words)
	    		  {
	    			  word = word.toLowerCase();
	    			  
	    			  if(!word.isEmpty())
	    			  {
	    				  m.put(word,m.getOrDefault(word, 0)+1);
	    				  
	    			  }
	    			  
	    			  
	    		  }
	    	  }
	    	  
	    	  List<Map.Entry<String, Integer>> al = new  ArrayList<>(m.entrySet());
	    	  
	    	 // System.out.println(al);
	    	  
	    	  al.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
	    	  
	    	  for(Map.Entry<String,Integer> e : al)
	    	  {
	    		  bw.write(e.getKey()+" "+e.getValue());
	    		  
	    		  bw.newLine();
	    		  
	    	  }
	    	  
	    	  System.out.println("words and frequency counts successfully inserted in the file.");
	    	  
	    	  br.close();
	    	  bw.close();
			
	    	  
		  } 
	      
	      catch (IOException e) {
			// TODO: handle exception
	    	  e.printStackTrace();
		}
		
	      
		}

	}


