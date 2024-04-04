package demo;
 class Parent_class
 {
	void add()
	{
		int a = 10;
		int b = 20;
		System.out.println(" The sum of two numbers : " +b);
	}
	void sub()
	{
		int a = 20;
		int b = 15;	
		System.out.println(a-b);
	}
 }
public class Child_Class extends Parent_class

{    void mul()
     {
	int a = 100;
	int b = 2;
	System.out.println("The Mul of the two numbers is : " + a*b);
      }
	public static void main(String[] args) 
	{
		Child_Class c1 = new Child_Class();
		c1.mul();
		c1.add();
		c1.sub();	
}	

}
