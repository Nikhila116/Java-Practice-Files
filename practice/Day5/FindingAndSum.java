package Day5;

public class FindingAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 100,c=0;
		 int sum =0;
		
		while(n<=200)
		{
			if(n%9 == 0)
			{
				System.out.println(n);	
				
				sum += n;  //sum = sum+n
			}
			n++;
			
			
		}
		
		System.out.println("sum of the numbers is:"+sum);

	}

}
