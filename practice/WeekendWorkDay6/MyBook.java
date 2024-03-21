package WeekendWorkDay6;


abstract class Book
{
	String title;
	abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}
	
}

public class MyBook extends Book {
	
	/*String title ="This title is:";
	
	String getTitle()
	{
		String title ="This title is:";
		return title;
	}*/

	@Override
	void setTitle(String s) {
		
		
		// TODO Auto-generated method stub
		System.out.println("This title is: "+ s);
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBook mb = new MyBook();
		
		/*System.out.println("The"+mb.getTitle()+"is:");
		String s=mb.getTitle();
		
		System.out.print(s);*/
		
		mb.setTitle("Tale of two cities");

	}

}
