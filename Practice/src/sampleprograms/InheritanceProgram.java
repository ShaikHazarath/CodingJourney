package sampleprograms;
 class Parent
 {
	 static void add()
	 {
		 int a = 1100;
		 int b = 1200;
		 System.out.println("The Sum of the Numbers are : "+ (a+b));
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
	void mul() {
		double  a = 2501.03;
		double b = 52.01;
		System.out.println("The Mulplication of two numbers is : " + (a*b));
	}
	void div () {
		short a = 120;
		short b = 14;
		System.out.println("The Division of two numbers is : "+ (a/b));
	}
	public static void main(String[] args)
	{
		InheritanceProgram i1 = new InheritanceProgram();
		i1.sub();
		i1.mul();
		i1.div();
		InheritanceProgram.add();
	}
}
