package textFormating;

import java.text.*;
import java.util.Date;

public class Text_FormatEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageFormat mf = new MessageFormat("on time\t{0,time},on date\t{0,date}\n{1}");
		
		Object []obj = {new Date(),"This System will be working..."};
		
		String message = mf.format(obj);
		
		System.out.println(message);

	}

}
