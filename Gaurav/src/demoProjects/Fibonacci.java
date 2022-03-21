package demoProjects;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1=new Scanner(System.in);
		System.out.println("Enter fibonacci limit you need");
		int x=num1.nextInt();
		int a=0, b=1, c;
		for(int i=1; i<=x; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		num1.close();
	}

}
