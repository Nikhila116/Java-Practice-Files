package textFormating;

import java.text.*;

public class Text_FormatEx {
	
	public static void main(String[] args) {
	
	MessageFormat mf = new MessageFormat("String:{0}\nInteger: {1}\nDouble:{2}");
	
	Object []obj = {"This is a string",20,85.67};
	
	String display = mf.format(obj);
	
	System.out.println(display);
	
	
	}
	
	

}
