package Day5;

public class ArmstrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,p = 0,rem=0;
		
		int cal=0;
		
		for(i=1;i<=1000;i++)
		{
			
			int comp =i;
			int temp =i;
			int temp1 = i;
			
			while(temp1!=0)
			{
				temp1=temp1/10;
				
				p++;
			}
			
			//System.out.println(p);
			
			while(temp!=0)
			{
				rem = temp %10;
				cal += (int) (Math.pow(rem,p));
				temp = temp /10;
				
				
			}
			
			//System.out.println(cal);
			if(cal == comp)
			{
				System.out.println(i);
			}
			cal =0;
			p=0;
			
			
			
	}

}
}
