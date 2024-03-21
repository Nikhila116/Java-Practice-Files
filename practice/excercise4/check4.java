package excercise4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class check4 implements Serializable{
	
	String name ;

	public check4(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public static void main(String[] args)
	{
		
		check4 obj = new check4("nikhila");
		
		try {
	
		FileOutputStream fp = new FileOutputStream("file.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fp);
		
		oos.writeObject(obj);
		
		oos.close();
		
		fp.close();
		
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	


}
