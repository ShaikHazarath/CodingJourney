package demo;
import java.util.Scanner;
public class Scannerprogram {

    public static void main(String[] args)
    {
	Scanner s1 = new Scanner(System.in);
	 byte a1 = s1.nextByte();
	 System.out.println(a1);
	 
	 int a2  = s1.nextInt();
	 System.out.println(a2);
	 
	 long a3 = s1.nextLong();
	  System.out.println(a3);
	  
	  short a4 =  s1.nextShort();
	  System.out.println(a4);
	  
	  String a5 = s1.next();
	  System.out.println(a5);
    }
    

}
