package package3;


// This Keywords Use in method

public class MethodA

{
   public void m1()
    {
	   
	System.out.println("I am first method");
	this.m2();
	
    }
   
   public void m2()
   
   {
	System.out.println("I am second method");
   }
	
   public static void main(String[] args) 
   {
	  MethodA m=new MethodA();
	  m.m1();
	   
   }
   
}
