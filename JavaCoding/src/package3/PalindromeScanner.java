package package3;

import java.util.Scanner;

public class PalindromeScanner {

	public static void main(String[] args)
	{
		
		String reverse="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the string");
		
		String original = sc.nextLine();
		int len = original.length();
		
		for(int i=len-1; i>=0; i--)
		{
			reverse=reverse+original.charAt(i);
		}
		

		if(reverse.equals(original))
		{
			System.out.println("This is Palindrome");
		}
		else
		{
			System.out.println("this is not a palindrome");
		}
	}

}
