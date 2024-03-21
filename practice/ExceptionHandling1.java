import java.io.IOException;

public class ExceptionHandling1 {
	
	void s() throws IOException    //checked exceptions will be used by throws to throw the exception
	{
		throw new java.io.IOException("error");
	}
	
	void s1(){
		try {
			s();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void s2(){
		try {
			s();
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
			//e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling1 eh = new ExceptionHandling1();
		eh.s2();
		System.out.println("...");

}
}
