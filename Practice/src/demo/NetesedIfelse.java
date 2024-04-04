package demo;
import java.util.Scanner;
public class NetesedIfelse
{

	public static void main(String[] args, Object esle)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Distance : ");
		double distance = sc.nextDouble();
		double ticketPrice;
		
		if (distance>0 && distance<=100)
		{
			ticketPrice = 700.00;
			System.out.println("Ticket Price is : "+ticketPrice);
		}
		else if(distance<=500)
		{
			ticketPrice = 500.20;
			System.out.println("Ticket Price is : "+ ticketPrice);
		}
		
		else
		{
			ticketPrice = 900.00;
			System.out.println("Ticket Price is : "+ticketPrice);
		}				
  }	
}
