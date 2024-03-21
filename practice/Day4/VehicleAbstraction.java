package Day4;

abstract class Vehicle
{
	abstract void car();
	abstract void bike();
	abstract void motor();
	void scooty() {
		System.out.println("This is a scooty method");
	}
}

abstract class VehicleImplementation extends Vehicle
{
	 void car()
	{
		System.out.println("This is a car method");
	}

	@Override
	void bike() {
		// TODO Auto-generated method stub
		System.out.println("This is a bike method");
		
	}

	@Override
	void motor() {
		// TODO Auto-generated method stub
		System.out.println("This is a motor method");
		
	}
	
	abstract void byWalk();
}

 class VehicleAbstraction extends VehicleImplementation {	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleAbstraction v = new VehicleAbstraction();
		
		v.motor();
		v.scooty();
	}

	@Override
	void byWalk() {
		// TODO Auto-generated method stub
		
	}

}
