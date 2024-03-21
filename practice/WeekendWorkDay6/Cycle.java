package WeekendWorkDay6;

class MotorCycle
{
	void functionality()
	{
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
	}
}

public class Cycle extends MotorCycle{
	
	void baseClassFunctionality()
	{
		super.functionality();
	}
		
	void functionality()
	{
		
	    //super.functionality();
		
		System.out.println("My ancestor is a cycle who is a vehicle with pedals." );
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Cycle c = new  Cycle ();
		 
		 c.baseClassFunctionality();
		 
		 c. functionality();
		 
		
		
	}

}
