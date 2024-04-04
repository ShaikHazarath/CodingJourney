package demo;

public class ConstrcutorOverloading {
	int operant1 = 0;
	int operant2 = 0;
	
	ConstrcutorOverloading(int operant1, int operant2)
	{
		this.operant1 = operant1;
		this.operant2 = operant2;
	}
	public int addition()
	{		
		return operant1 + operant2;		
	}
	public int subtration()
	{
		return operant1 - operant2;
	}
	public int getOperant1()
	{
		return operant1;		
	}
	public int getOperant2()
	{
		return operant2;		
	}
	public void setOperant1(int operant1)
	{
		this.operant1 = operant1;		
	}
	public void setOperant2(int operant2)
	{
		this.operant2 =operant2;		
	}
	
	public static void main(String[] args) 
	{
		ConstrcutorOverloading s1 = new ConstrcutorOverloading(10,20);
		
	
		System.out.println("addition : "+s1.addition());
System.out.println("subtration : "+s1.subtration());
	
	}
}
