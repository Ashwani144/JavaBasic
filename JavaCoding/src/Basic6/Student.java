package Basic6;

public class Student
{

	public void arthmetic(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("sum of two Values "+ c);
	}
	public void arthmetic(int a, int b, int c)
	{
		int d;
		d=a+b+c;
		
		System.out.println("sum of three Values "+ d);
		
	}
	
	public static void main(String[] args) 
	{
		
		Student s=new Student();
		s.arthmetic(10, 15);
		s.arthmetic(12, 15, 18);

	}
	
	
}
