package sampleprograms;
class Velhicle
 {
	public void methodNameDriven()
	{
		System.out.println("The MethodDrive is : " + ("Velhicle is being Driven"));
	}
    }
    public class Accelerate extends Velhicle
    { 
    	public void accelerateMethod()
    	{
    	
    	System.out.println("The methodAccelerate is : "+ ("Car is Accelerating"));
    }
	public static void main(String[] args)
	{
		Accelerate c1 = new Accelerate();
		c1.methodNameDriven();
		c1.accelerateMethod();
	 }
 }
