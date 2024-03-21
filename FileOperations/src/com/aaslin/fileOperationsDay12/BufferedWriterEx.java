package com.aaslin.fileOperationsDay12;

import java.io.*;

public class BufferedWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter("D:\\FileOperations\\file.txt",true)))
		{
			
			br.write("\n nikhila");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
