package Basic6;

public class Ashwani extends Employee
{

	public Ashwani()
	{
		super(1, 2);             // call 2nd parent parameter
		System.out.println("Child default constructor");
	}
	
	public Ashwani(int a)
	{
		this(1,2,3);
		System.out.println("Child one parameterized constructor");
	}
	public Ashwani(int a, int b)
	{
		this(1,2,3,4);          //call 4 child
		System.out.println("Child Two parameterized constructor");
	}
	
	public Ashwani(int a, int b,int c)
	{
		this();
		System.out.println("Child Three parameterized constructor");
	}
	
	public Ashwani(int a, int b, int c, int d)
	{
		this(1);            // call one child
		System.out.println("Child Four parameterized constructor");
	}
	
	public static void main(String[] args)
	{
		Ashwani as=new Ashwani(3, 4); // call 2nd Child
		
	}
}
