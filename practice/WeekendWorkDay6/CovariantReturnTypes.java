package WeekendWorkDay6;
import java.util.*;


//Flowers..
class Flower
{
	String nameOfTheFlower()
	{
		return "Returns name of the flower based on the state given.";
	}
}

class Jasmine extends Flower
{
	@Override
	String nameOfTheFlower()
	{
		return "Jasmine";
	}
}


class Lily extends Flower
{
	@Override
	String nameOfTheFlower()
	{
		return "Lily";
	}
}

class Lotus extends Flower
{
	@Override
	String nameOfTheFlower()
	{
		return "Lotus";
	}
}



//States..
class State
{
	Flower getTheFlowerName()
	{
		return new Flower();
	}
}

class WestBengal extends State
{
	@Override
	Jasmine getTheFlowerName()
	{
		return new Jasmine();
		
	}
}

class AndhraPradesh extends State
{
	@Override
	Lily getTheFlowerName()
	{
		return new Lily();
	}
}

class Karnataka extends State
{
	@Override
	Lotus getTheFlowerName()
	{
		return new Lotus();
	}
}

public class CovariantReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WestBengal wb = new WestBengal();
		
		AndhraPradesh ap = new AndhraPradesh();
		
		Karnataka k = new Karnataka();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the state :");
		
		String str = sc.next();
		
		switch(str)
		{
		case "WestBengal":
			
			Jasmine j = wb.getTheFlowerName();
			
			System.out.println(j.nameOfTheFlower());
			
			break;
			
		case "AndhraPradesh":
			
			Lily l = ap.getTheFlowerName();
			
			System.out.println(l.nameOfTheFlower());
			
			break;
			
		case "Karnataka":
			
			Lotus lo = k.getTheFlowerName();
			
			System.out.println(lo.nameOfTheFlower());
			
			break;
			
			
		}

	}

}
