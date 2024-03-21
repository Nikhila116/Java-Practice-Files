package com.aaslin.fileOperationsDay12;
import java.io.*;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			System.out.println("Buffered reader class");
			
			/*while(br.ready())
			{
				
			}*/
			
			System.out.println(br.readLine());
			
			
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}

	}

}
