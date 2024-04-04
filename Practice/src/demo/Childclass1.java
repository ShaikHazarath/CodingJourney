package demo;
class parentclass{
	
	void add() {
		int a = 1000;
		int b = 2000;
		System.out.println("The Sum of the two numbers : " +  (a+b));
	}
	void sub() {
		int a = 1000;
		int b = 2000;
		System.out.println( a-b);
	}
}
public class Childclass1 extends parentclass
{
    void mul() {
	int a = 100000;
	int b = 500;
	System.out.println("The Multlipication is two numbers is : " + (a*b));
}
	public static void main(String[] args)
	{
		 Childclass1 c1 = new  Childclass1();
		 c1.mul();
		 c1.add();
		 c1.sub();
	}
}
