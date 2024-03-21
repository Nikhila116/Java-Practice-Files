package Day4;

abstract class Cooking1{
	
	 abstract void cookingInProgress();
	 
	 abstract void serving();
	 
	 void ingredients()
	 {
		 System.out.println("all veggies");
	 }
	 
	 abstract void feedback();
	
	
}
public class PreparingBiryani extends Cooking1 {
	
	
	

	@Override
	void serving() {
		// TODO Auto-generated method stub
		System.out.println("serving...");
		
	}

	@Override
	void feedback() {
		// TODO Auto-generated method stub
		System.out.println("getting feedback...");
		
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PreparingBiryani pb = new PreparingBiryani();
		pb.serving();
		pb.feedback();
		

	}

	@Override
	void cookingInProgress() {
		// TODO Auto-generated method stub
		
	}

	
}
