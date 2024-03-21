
public class ClassNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		Class.forName("hi");
		}
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}