package WeekendWorkDay6;


import java.util.*;


class Student1{
	
}
class Rockstar1{
	
}
class Hacker1{
	
}


public class InstanceofClassSRH{
	
	 int a=0,b=0,c=0;

    String count(ArrayList  al)
   {
	   Iterator i = al.iterator();
         
        while(i.hasNext())

       {

        Object ob = i.next();

       if(ob instanceof Student1)
        {
           a++;
        }
        else if(ob instanceof Rockstar1)
        {
           b++;
        }
        else if(ob instanceof Hacker1)
        {
           c++;
        }  
	   
	   
   }
String str = a+" " +b +" "+c;
   
return str;
   }
   

   public static void main(String []args){
	 
	InstanceofClassSRH s1 = new InstanceofClassSRH();
	    
      ArrayList al = new ArrayList();
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      for(int i=0; i<n; i++){
    	  
         String s = sc.next();
         
         if(s.equals("Student"))
        	 {
        	 
        	 al.add(new Student1());
        	 
        	 }
         
         if(s.equals("Rockstar"))
        	 {
        	 
        	 al.add(new Rockstar1());
        	 
        	 }
         
         if(s.equals("Hacker"))
        	 {
        	 
        	 al.add(new Hacker1());
        	 
        	 }
      }
    System.out.println(s1.count(al));
   }
}