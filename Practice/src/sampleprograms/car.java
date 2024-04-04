package sampleprograms;
class drive
 {
	public void drive()
	{
		System.out.println("Velhicle is being Driven");
	}
 }
    public class car extends drive
    { 
    	public void accelerate()
    	{
    	
    	System.out.println("Car is Accelerating");
        }   
public static void main(String[] args)
	{
		car c1 = new car();
		c1.drive();
		c1.accelerate();
	 }
 }
