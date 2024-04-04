package sampleprograms;

public class SIBandIIBSampleProgram 
{
	static          //SIB Method
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");        //IIB Method
	}
	static 
	{
		System.out.println("SIB 1");
	}
	{
		System.out.println("IIB 1");
	}

	public static void main(String[] args) {
		
		System.out.println("MainMethod");
		 SIBandIIBSampleProgram s1 = new  SIBandIIBSampleProgram();
	}
}
