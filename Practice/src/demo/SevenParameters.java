package demo;

public class SevenParameters {
	String name;
	int id;
	int age;
	double salary;
	String mail;
	String mobileNumber;
	String location;
	
	SevenParameters(String name,int id, int age, double salary,String mail,String mobileNumber,String location)
	{
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary= salary;
		this.mail = mail;
		this.mobileNumber= mobileNumber;
		this.location= location;
	}
	public String toString()
	{
		return  "Employee Details :\n" +
	            "Name : " + name + "\n" +
	            "Id : " + id + "\n" +
	            "age :" + age + "\n"+
	            "Salary : " + salary + "\n" +
	            "Email : " + mail + "\n" +
	            "Mobile Number : " + mobileNumber + "\n" +
	            "Location : " + location;
	}
	
	public static void main(String[] args) {
		SevenParameters s1Parameters = new SevenParameters("Hazarath",20,30,25000,"hazarathshaik286@gmail.com","9550075286","Hyderabad");
	
		
		System.out.println(s1Parameters );
	}

}
