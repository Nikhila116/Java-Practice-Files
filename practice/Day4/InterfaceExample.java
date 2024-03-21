package Day4;

interface  ContractorA
{
	public void salaryIncrements(int s);
	
	public void contractBases(String s,int c);
	
	public void weekendHolidaysSchedule(String h);
	
	
}


interface ContractorB
{
   public void salaryIncrements(int s);
	
	public void contractBases(String s,int c);
	
	public void weekendHolidaysSchedule(String h);
	
	
}

public class InterfaceExample implements ContractorA,ContractorB {
	
   public void salaryIncrements(int s)
   {
	   int salary = s * 10000;
	   System.out.println(s+" is the salary");
	   
   }
	
	public void contractBases(String s,int c)
	{
		String contract = s;
		
		int numberOfContracts = c;
		System.out.println(s+" is the contract and got "+numberOfContracts+" contract");
	}
	
	public void weekendHolidaysSchedule(String h)
	{
		System.out.println(h+" is a holiday");
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceExample i = new InterfaceExample();
		
		ContractorA i1 = new InterfaceExample();
		ContractorB i2 = new InterfaceExample();
		
		i1.salaryIncrements(40000);
		i1.contractBases("time and material ",1);
		i1.weekendHolidaysSchedule("tuesday");
		System.out.println("---------------------");
		i1.salaryIncrements(60000);
		i1.contractBases("executing ",1);
		i1.weekendHolidaysSchedule("wednesday");
		
		
		
	

	}

	

	

}
