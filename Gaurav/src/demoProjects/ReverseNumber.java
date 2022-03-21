package demoProjects;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to make it Reverse");
		Scanner num1= new Scanner(System.in);
		int x=num1.nextInt();
		int rem, rev=0;
		while(x!=0)
		{
			rem=x%10;
			rev= rev*10+rem;
			x=x/10;
		}
		System.out.println("Reverse number is "+rev);
		num1.close();
	}

}
