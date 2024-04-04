package demo;
import java.util.Scanner;
public class Nestedif
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Type of travel : ");
		
		String typeOfTravel =sc.next();
		double ticketPrice;
	       if(typeOfTravel.equals("seater"))
	       {
	    	    ticketPrice = 500.20;
	    	    System.out.println("ticketPrice : "+ ticketPrice);    	   
	       }
	       else if(typeOfTravel.equals("sleeper"))
	       {
	    	   ticketPrice = 1000;
	    	   System.out.println("ticketPrice : "+ticketPrice);
	       }
	       else if(typeOfTravel.equals("ac - sleeper"))
	       {
	    	   ticketPrice = 1500;
	    	   System.out.println("ticketPrice : "+ticketPrice);
	       }
	       else if(typeOfTravel.equals("non - ac Sleeper"))
	       {
	    	   ticketPrice = 1200;
	    	   System.out.println("ticketPrice : "+ticketPrice);
	       }
	       else
	       {
	    	   ticketPrice = 1650;
	    	   System.out.println("ticketPrice :"+ticketPrice);
	       }	     
     }
}
