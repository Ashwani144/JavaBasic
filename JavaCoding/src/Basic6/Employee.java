package Basic6;

public class Employee
{

	public Employee()
	{
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	
	public Employee(int a)
	{
		this();
		System.out.println("Parent one parameterized constructor");
	}
	
	public Employee(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("Parent Two parameterized constructor");
	}
	
	public Employee(int a, int b,int c)
	{
		System.out.println("Parent Three parameterized constructor");
	}
	
	public Employee(int a, int b, int c, int d)
	{
		this(1);
		System.out.println("Parent four parameterized constructor");
	}
}
