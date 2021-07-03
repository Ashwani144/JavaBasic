package package3;

import java.util.Scanner;

// Original and reverse are same 

public class PalindromePra1 {

	public static void main(String[] args)
	{
	
		String reverse="";
	    System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		int len = str.length();
		
		for(int i=len-1; i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}

		System.out.println("Enter the reverse number :" +reverse);
		
		if(reverse.equals(str))
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}

}
