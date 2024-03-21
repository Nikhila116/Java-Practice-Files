package Day5;

public class NullPointerExceptionExample {
	
	public static void displayArray(String []myArray)
	{
		System.out.println("first element in my array:"+myArray[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []myArray = null;
		
		displayArray(myArray);
	

	}

}
