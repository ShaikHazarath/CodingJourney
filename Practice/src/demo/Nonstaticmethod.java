package demo;
public class Nonstaticmethod {
	static void add() 
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);	
	}
	static void sub()
	{
		int a = 200;
		int b = 300;
		System.out.println(a-b);
	}
	static void mul()
	{
		int a = 100;
		double b = 20.01;
		System.out.println(a*b);
	}	
	static void div()
	{
		int a = 100;
		int b = 5;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Nonstaticmethod Nonstaticmethod = new Nonstaticmethod();
		demo.Nonstaticmethod.add();
		demo.Nonstaticmethod.sub();
		demo.Nonstaticmethod.mul();
		demo.Nonstaticmethod.div();
		
	}

}
