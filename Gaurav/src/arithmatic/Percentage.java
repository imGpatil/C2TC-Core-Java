package arithmatic;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter marks you got");
		Scanner num1= new Scanner(System.in);
		Scanner num2= new Scanner(System.in);
		float x= num1.nextInt();
		System.out.println("Enter your total marks");
		int y= num2.nextInt();
		float z=x/y*100;
		{
			System.out.println("Your percentage is "+z);
		}
		num1.close();
		num2.close();
	}

}
