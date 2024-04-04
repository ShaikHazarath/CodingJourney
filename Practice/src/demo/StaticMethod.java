package demo;

public class StaticMethod {
	
	 void add () {
		int a = 100;
		int b = 100;
		System.out.println("The Sum of the Number : " + (a+b));
	}
	 void sub() {
		int a = 200;
		int b = 100;
		System.out.println("The Sub of the Number is : "+ (a-b));
	}
	 void mul() 
	 {
		 int a = 100;
		 int b = 6;
		 System.out.println("The mul of the Number:" + (a*b));
	 }

	public static void main(String[] args) {
		int a = 100;
		int b = 500;
		System.out.println("The Sum of the Number :  " + (a+b));
		
		
		int a1 = 500;
		int a2 = 600;
	    System.out.println("The sum of number:" + (a1+a2));
		
		StaticMethod s1 = new StaticMethod();
		s1.add();
		s1.sub();
		s1.mul();
			
		
	}

}
