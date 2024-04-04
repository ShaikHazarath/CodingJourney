package sampleprograms;
class Shape
{
	public void CalculateAreaMethod() 
	{
		System.out.println("Calculating Area");
	}
}
public class CalculateArea extends Shape
{
	public void Rectangle(int l, int b)
	{
		System.out.println("Calculating the Area : " + (l*b) );
	}
	public void Circle(int lenght, int breadth) {
		System.out.println("Calculating the Area of Circle : " +(lenght*breadth));
	}
	public static void main(String[] args) 
	{
		CalculateArea c1 = new CalculateArea();
		c1.Rectangle(20000, 5241254);
		c1.Circle(543214, 20);
		c1.CalculateAreaMethod();
	}

}
