package demo;

public class Methodoverloadingwithglobalvariable {

	int a = 10;
	double b = 10.2;
	static String c = "Sita";
	
	void add() {
		System.out.println(a+b);
	}
	void sub() {
		System.out.println(a-b);
	}
	static void string()
	{
	System.out.println(c);	
	}
	public static void main(String[] args) {
	
		Methodoverloadingwithglobalvariable a1 = new Methodoverloadingwithglobalvariable();
		a1.add();
		Methodoverloadingwithglobalvariable b1 = new Methodoverloadingwithglobalvariable();
		b1.sub();
		System.out.println(c);		
	}

}
