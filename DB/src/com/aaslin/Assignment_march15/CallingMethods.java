package com.aaslin.Assignment_march15;

import java.sql.*;

import java.util.*;

public class CallingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter\n '0' for inserting a record\n '1' for deleting a record\n '2' for updating a record\n:");
		
		int check = sc.nextInt();
		
		
		
		//connection
boolean isConnected = false;

isConnected = DataBaseConnections.Connections(isConnected);
		
if(isConnected == true)
 {
	System.out.println("Connected Successfully");
		
		
	//inserting record
	if(check == 0)
	{
		
		System.out.println("please enter no.of records you wanted to insert:");
		
		int n = sc.nextInt();
		
		for(int i = 0;i < n; i++)
			
		{
			
			System.out.println("please enter the query to insert:");
			
			sc.nextLine();
			
//			StringBuilder sb = new  StringBuilder();
//			
//			String q = "insert into employee1(name,dept_id)";
//			
//			String name = sc.nextLine();
		
			
			String query = sc.nextLine();  //"insert into employee1(name,dept_id) values ('rithu',3)" ;   //sc.nextLine();
			
			System.out.println(query);
			
			boolean Isinserted  = false;
				
			Isinserted = DataBaseConnections.Inserting(query);
			
			if(Isinserted == true)
			{
				System.out.println("1 row effected");
			}
			else
			{
				System.out.println("issue in inserting");
			}
			
		}
	}
		
		
		
	//deleting record
	else if(check == 1)
	{
		
       System.out.println("please enter no.of records you wanted to delete:");	
     
		int n = sc.nextInt();
		
	   for(int i = 0 ; i < n ; i++)
			
	 {
		//System.out.println("please enter the query to delete:");
		   
		sc.nextLine();    //to clear buffer when clicking enter.
		
        String delquery =  sc.nextLine();                                                      //"delete from  employee1 where id = 4";                                         //sc.next(); 
		
	    boolean isDeleted = DataBaseConnections.deleting(delquery);
	    
	    
	    if(isDeleted == true)
	    {
	    	System.out.println("Record Successfully Deleted");
	    }
	    
	    else	
	    {
	    	System.out.println("issue in deleting the record");
	    }
	    
	    
	  }
	 
	} 
	    
	  
	   //updating record
   else if(check == 2)
  {
		System.out.println("please enter no.of records you wanted to update:");
			
		int n = sc.nextInt();
				   
		for(int i = 0 ; i < n ; i++)
				
      {
	    	
	    System.out.println("please enter the query to update:");
	    
	    sc.nextLine();
		 
	    String updatingQuery = sc.nextLine();                    //"update employee1 set name ='karan' where id = 1";             //sc.next();  
	    
	    boolean isUpdated = false;
	    	
	    isUpdated =	DataBaseConnections.Updating(updatingQuery);
	    
	    if(isUpdated == true)
	    {
	    	System.out.println("Record is updated!");
	    }
	    
	    else
	    {
	    	System.out.println("Issue in updating the Record");
	    }
	    
	  }
	       
  }
	
   else
   {
	   System.out.println("please enter between 0-2 for inserting,deleting,updating a record in database");
   }

			
}

 
else		
{
	
  System.out.println("Issuing in connecting to the database");
  
		
}
		
}

}
