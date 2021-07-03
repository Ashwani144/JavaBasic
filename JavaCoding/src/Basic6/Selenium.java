package Basic6;

public class Selenium extends AutomationTesting
{

	public void method3()
	{
		System.out.println("I am Child Class selenium");
	}
	public static void main(String[] args) 
	{
		Selenium s1=new Selenium();
		s1.method1();
		s1.method2();
		s1.method3();
		
	}
}
