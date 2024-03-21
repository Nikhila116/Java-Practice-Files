package com.aaslin.ORM_Beginning_Practice_Day11;

class EmployeeInformation
{
	private int Id;
	
	private String name;
	
	private String mail;
	
	private String mobile;
	
	// for getting
	public int  get_Id(int n)
	{
		
		return Id;
		
	}
	
	public String get_name(String name)
	{
		
		return name;
	}
	
	public String get_String(String mail)
	{
		return mail;
	}
	
	public String get_mobileNo(String mobile)
	{
		return mobile;
	}
	
	//for setting
	
	public void set_Id(int Id)
	{
		this.Id = Id;
		
	}
	
	public void set_name(String name)
	{
		this.name = name;	
		
	}
	
	public void set_mail(String mail)
	{
		this.mail = mail;
		
	}
	
	public void set_mobile(String mobile)
	{
		this.mobile = mobile;
		
	}
	@Override                            
	public String toString()     //we are overriding the toString() method.
	{
		 return   "Employee Details: \nemp_id = "+ Id + "\nemp_name = "+ name + "\nemp_mail = "+ mail + "\nemp_mobileNo = "+ mobile +" ";
	                        
	}                      
	                        
}

public class StoringRetriveingUsingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeInformation ei = new EmployeeInformation();
		
		ei.set_Id(101);
		
		ei.set_name("Nikhila");
		
		ei.set_mail("sample@gmail.com");
		
		ei.set_mobile("7337403309");
		
		System.out.println(ei);

	}

}
