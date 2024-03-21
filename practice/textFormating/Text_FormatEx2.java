//MessageFormat.format(obj[],stringbuffer,fieldposition)

package textFormating;

import java.text.*;

public class Text_FormatEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageFormat mf = new MessageFormat("{0,number,#},{0,number,#.##},{0,number}");
		
		Object []obj = {new Double (856.7945)};  // object array.
		
		StringBuffer sb = new StringBuffer(10);  //to store the result.
		
		FieldPosition fp = new FieldPosition(MessageFormat.Field.ARGUMENT); // for position and alignment.
		
		sb = mf.format(obj, sb, fp);
		
		System.out.println(sb);

	}

}
