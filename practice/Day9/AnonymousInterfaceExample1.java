package Day9;

interface OuterExample
{
	interface InnerExample
	{
		void msg();
	}
}

public class AnonymousInterfaceExample1 {
	
	    static OuterExample.InnerExample oi = new OuterExample.InnerExample(){

		@Override
		public void msg() {
			// TODO Auto-generated method stub
			System.out.println("Nikhila");
		}
		
	  
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          oi.msg();
          
         
          
          
	}

}
