package demoProjects;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1= new Scanner(System.in);
		System.out.println("Enter your number");
		int x= num1.nextInt();
		int temp=x;
		int  rev=0, rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(x==rev)
		{
			System.out.println(x+" is palindrome");
		}
		else
		{
			System.out.println(x+" is not palindrome");
		}
		num1.close();
	}

}
