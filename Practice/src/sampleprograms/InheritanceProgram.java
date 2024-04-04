package sampleprograms;
 class Parent
 {
	 static void add()
	 {
		 int Operant1 = 1100;
		 int Operant2 = 1200;
		 System.out.println("The Sum of the Numbers are : "+ (Operant2+Operant1));
	 } 
 }
public class InheritanceProgram extends Parent
{
	void sub() 
	{
		int a = 1200;
		int b = 1500;
		System.out.println("The Sub of the two numbers are : "+ (a-b));
	}
	void mul()
	{
		double  a = 2501.03;
		double b = 52.01;
		System.out.println("The Mulplication of two numbers is : " + (a*b));
	}
	void div () 
	{
		short a = 120;
		short b = 14;
		System.out.println("The Division of two numbers is : "+ (a/b));
	}
	public static void main(String[] args)
	{
		InheritanceProgram inheritanceProgram = new InheritanceProgram();
		inheritanceProgram.sub();
		inheritanceProgram.mul();
		inheritanceProgram.div();
		inheritanceProgram.add();
	}
}
