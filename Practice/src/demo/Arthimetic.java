package demo;
import java.util.Scanner;
public class Arthimetic {
	
	static int add(int operant1,  int operant2)
	{
		System.out.println(operant1+operant2);
		return operant1+operant2;
	}
	static int sub(int operant1, int operand2) 
	{
		System.out.println(operant1 - operand2);
		return operant1- operand2;
	}
	static int mul(int operant1, int operant2)
	{
		System.out.println(operant1 * operant2);
		return operant1 * operant2;		
	}
	
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);		
		System.out.print(" Enter the Operant1: ");
		int operant1 = sc.nextInt();
		System.out.print("Enter the Operant2: ");
		int Operant2 = sc.nextInt();
		System.out.print("Enter the Operant3: ");
		int Operant1  = sc.nextInt();
		
		
		
		 
		int addition = add(Operant1, Operant2);
		int subtration = sub(Operant1,Operant2);
		int multiplication = mul(Operant1, Operant2);
		
		
	 Arthimetic arthimetic = new  Arthimetic(); 
		 System.out.println("Addition:");
		Arthimetic.add(Operant1,Operant2);
		 
		 System.out.println("Subtration:");
		Arthimetic.sub(Operant1, Operant2);
		
		System.out.println("Multiplication");
		Arthimetic.mul(Operant1, Operant2);
			
		
	}
}
