package Day4;

public class BiryaniMaking extends CookingAbstractionExample{

	@Override
	void prepareBiryani() {
		// TODO Auto-generated method stub
		System.out.println("preparing biryani");
		
	}

	@Override
	void ServeBiryani() {
		// TODO Auto-generated method stub
		System.out.println("serving the prepared biryani of ingrediants:");
		
	}


	@Override
	void getTheFeedback() {
		// TODO Auto-generated method stub
		System.out.println("getting the feedback");
		
	}
	
	public static void main(String[] args)
	{
		
		BiryaniMaking b = new BiryaniMaking();
		b.prepareBiryani();
		b.ServeBiryani() ;
	    b.getIngrediants();
		b.getTheFeedback() ;
		
		
	}
	

}
