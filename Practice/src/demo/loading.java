package demo;

public class loading {
	
	
	loading () 
	{	
		System.out.println("20");
	}
	loading (int a, int b)	
	{	
		System.out.println(a+b);
	}
	loading (int a, double d, int b)
	{
		System.out.println(a+d+b);
	}
	loading (Boolean a, char C)	
	{
		System.out.println("Apple,M");
	}
loading (int a, float c)
	{
		System.out.println("10000,200.0524");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		loading a = new loading();
		loading a1 = new loading(20,40);
		loading a3 = new loading(10,20.1,1);
		
	}

}
