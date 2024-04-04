package sampleprograms;
class Parent1
{  
	 void add() 
	{
		System.out.println("The Output is Addition");
	}	
}
public class MethodOverriding extends Parent1
{
	 void add() 
	{
		System.out.println("The Output is Subtration");
		super.add();	
	}	
	public static void main(String[] args)
	{
		MethodOverriding m1 = new MethodOverriding();
		m1.add();
	}
}
