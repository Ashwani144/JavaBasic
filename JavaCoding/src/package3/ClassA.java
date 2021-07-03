package package3;

// How to Use constructor - Learn

public class ClassA 
{

	public ClassA() 
	
	{
	System.out.println("Default Constructor");
	}
	
	public ClassA(int a) 
	
	{
		this(10, 5);
	System.out.println("one parameterized Constructor");
	}
	
	public ClassA(int a, int b) 
	
	{
	System.out.println("two parameterized Constructor");
	}
	
	public static void main(String[] args)
	{
	
		ClassA ref=new ClassA(112);
	}
}
