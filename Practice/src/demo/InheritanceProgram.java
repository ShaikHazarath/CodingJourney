package demo;
 class parent_class
{
		void add() {
			int a = 10;
			int b = 20;
			System.out.println("The Sum of the number : "+ a+b);
		}
		void sub () {
			int a = 10;
			int b = 20;
			System.out.println(  a-b);
		}
}
public class InheritanceProgram extends parent_Class
{   void mul () 
{
	int a = 100;
	int b = 2;
	System.out.println("The Mul : "+ a*b);
}		
	public static void main(String[] args) {
		InheritanceProgram p1 = new InheritanceProgram();
		p1.mul();
		p1.add();
		p1.sub();
}
}
	



