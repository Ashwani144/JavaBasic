package package3;

public class AromNumber {

	public static void main(String[] args)
	{
	
		int num = 153; // To check the this number is Armstrong Number
		int orginal=num;
		int temp=0; 
		int r;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			temp=temp+r*r*r;
			
		}
		
		if(orginal==temp)
		{
			System.out.println("This is Aromnstrong Number");
		}
		else
		{
			System.out.println("This is not Aromnstrong Number");
		}

	}

}
