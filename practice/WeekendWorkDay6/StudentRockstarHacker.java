package WeekendWorkDay6;

import java.util.*;


class Student{}
class Rockstar{}
class Hacker{}


public class StudentRockstarHacker
{
   static String count(ArrayList al)
   {
      int a=0,b=0,c=0;
     /* for(int i=0;i<mylist.size();i++)
      {
        Object element=mylist.get(i);*/
      
    	  Iterator it = al.iterator();
    	  
    	  while(it.hasNext()) 
    	  {
    	     Object element = it.next();
    	  
              if(element instanceof Student)
              {
                a++;
              }
         
              else if(element instanceof Rockstar)
              {
                b++;
              }
         
              else if(element instanceof Hacker)
              {
                c++;
              }
         
    	  }
    	  
     /* }String ret= Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);*/
    	  
      String ret= a+" "+b+" "+c;

      return ret;
   }

   public static void main(String []args)
   {
      ArrayList al=new ArrayList();
      
      Scanner sc=new Scanner(System.in);
      
      int n=sc.nextInt();
      
      for(int i=0;i<n;i++)
      {
    	  
         String s=sc.next();
         
         if(s.equals("Student"))
        {
        	 al.add(new Student());
        }
         
         if(s.equals("Rockstar")) 
         {
        	 al.add(new Rockstar());
         }
         
         if(s.equals("Hacker")) 
         {
        	 al.add(new Hacker());
         }
         
      }
      
      System.out.println(count(al));
      
   }
}