package package3;

import java.util.Scanner;

public class Eventusingscanner {

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the number");
		
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("This Number is Even");
		}
		else
		{
			System.out.println("This Number is not Even");
		}

	}

}
