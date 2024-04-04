package demo;
public  class Sampleprogram {
	 void add() {
		 
		 int a = 100;
		 int b = 200;
		 System.out.println(a+b);		 
	}
	 void sub() {
		  
		 int a = 100;
		 int b = 200;
		 
		 System.out.println(a-b);	 
	 }
	 void multiple() {	 
		 int a = 5000;
		 int b = 2;
		 
		 System.out.println(a*b);
	 }	
	public static void main(String[] args) {
		Sampleprogram n1 = new Sampleprogram();
		
		n1.add();
		n1.sub();
		n1.multiple();	
	}

}
