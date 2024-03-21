package com.aaslin.FileOperations_Assignment;

//package com.aaslin.FileOperations_Assignment;

import java.io.*;

import java.util.*;

public class Cipher_SubstitutionChecking{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			
		File f = new File("encrypted.txt");
			
		f.createNewFile();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("please enter the message:");
		
		String message = reader.readLine();
		
        System.out.println("please enter the key:");
        
        Scanner sc = new Scanner (System.in);
		
		int key = sc.nextInt();
		
		//<--encrypting method-->
		String encrypted_Msg = encrypt(message,key);
		
		//<--writing to file-->
		writeToDestinationFile("encrypted.txt",encrypted_Msg);
		
		
		
		//<--decrypting the file to get the original text-->
		String decrypted_Msg = decrypt(encrypted_Msg,key);
		
		System.out.println("Encrypted Text is:"+encrypted_Msg);
		
	
		System.out.println("Decrypted Text is:"+decrypted_Msg);
		
		
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}


	//message encrypting...
	public static String encrypt(String message,int key) {
		
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0;i<message.length();i++)
		{
			char ch = message.charAt(i);
			
			if(Character.isLetter(ch))
			{
				if(Character.isUpperCase(ch))
				{
					sb.append((char)('A'+(ch-'A'+key)%26));
					
				}
				else
				{
					sb.append((char)('a'+(ch-'a'+key)%26));
				}
			}
			else
			{
				sb.append(ch);
			}
		}
		
		
		return sb.toString();
	}
	
	
	//writing to file...
	public static void writeToDestinationFile(String filename, String encrypted_Msg) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename)))
		{
			
			bw.write(encrypted_Msg);
			
			System.out.println("Message encrypted!! Succesfully");
			
			
		}
		catch(IOException i)
		{
			
			i.printStackTrace();
			
		}
		
	}
	
	
	/*public static String decryptFromFile(String filename,int key) {
		
		StringBuilder sb = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename)))
		{
			String line;
			while((line = br.readLine()) != null )
			{
				sb.append(decrypt(line,key));
			}
			
			return sb.toString();
			
			
		}
		
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			
			return null;
		}
		
	}*/
	
	
	
	
	
	//decrypting the encrypted text
	
	 public static String decrypt(String encrypted_Msg,int key) {
		 
		 
			
		 StringBuilder sb = new StringBuilder();
		 
		 for(int i=0;i<encrypted_Msg.length();i++)
		 {
			 char ch = encrypted_Msg.charAt(i);
			 
			 if(Character.isLetter(ch))
			 {
				 if(Character.isUpperCase(ch))
				 {
					 sb.append((char)('A'+(ch-'A'+26-key)%26));
				 }
				 else
				 {
					 sb.append ((char)('a'+(ch-'a'+26-key)%26));
				 }
			 }
			 
			 else
			 {
				 sb.append(ch);
			 }
		 }
		 
			return sb.toString();
		}


}
