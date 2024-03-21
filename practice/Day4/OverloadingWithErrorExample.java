package Day4;

public class OverloadingWithErrorExample {
	
	
	public int area(int l, int b)
	{
		return (l*b);
	}
	
	public float area(float l , float b )
	{
		return (l*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		OverloadingWithErrorExample oee = new OverloadingWithErrorExample ();
		
		int r1 = oee.area(2,3);
		
		float r2 = oee.area(2.34f,4.54f);
		
		
		
		System.out.println("This is an integer "+r1);
		
		System.out.println("This is a float "+r2);
		
        Float f = new Float(r2);
		
		System.out.println("This a float value converted to int value "+ f.intValue());
		
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
