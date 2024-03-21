package com.asslin.JDBC_Assignment2_Day11;

import java.util.*;

public class EmailBuilder {
	
	public static String emailBuilder(String[] Subscribers,String[] Topics)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("please enter your name:");
		
		String name = s.next();
		
		System.out.println("please enter your topic:");
		
		String Topic = s.next();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<Subscribers.length;i++)
		{
			if(Subscribers[i].equals(name))
			{
		
		    sb.append("Dear ").append(name).append("\n\n");
		    
			}	
	    }
		
		for(int i=0;i<Topics.length;i++)
		{
			
			if(Topics[i].equals(Topic))
			{
				switch (Topic)
				{
				case "java":
					sb.append("Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. "
							+ "\nIt is a general-purpose programming language intended to let application developers \"write once, run anywhere\" "
							+ "\n(WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.\n\n");
			        sb.append("Thanks and Regards,\nMailer");
			        break;
				
				
				case "python":
					sb.append("Python is a general-purpose language,used to create a range of applications,"
							+ "\nincluding data science, software and web development, "
							+ "\nautomation, and improving the ease of everyday tasks\n\n");
			        sb.append("Thanks and Regards,\nMailer");
			        break;
			        
				case "os":
					sb.append("Operating system (OS), program that manages a computer's resources,"
							+ "\nespecially the allocation of those resources among other programs."
							+ "\n(Typical resources include the central processing unit (CPU),computer memory, "
							+ "\nfile storage,input/output (I/O) devices, and network connections.\n\n");
			        sb.append("Thanks and Regards,\nMailer");
			        break;
			}
		
		}
		
	}
		
		return sb.toString();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Subscribers = {"nikhila","jyothi","reshmika","lavanya"};
		
		String[] Topics  = {"java","python","os"};
		
		String emailBody = emailBuilder(Subscribers,Topics);
		
		System.out.println(emailBody);

	}

}
