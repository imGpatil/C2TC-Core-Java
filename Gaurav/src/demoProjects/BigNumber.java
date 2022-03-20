package demoProjects;
import java.util.*;
public class BigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any two numbers for comparing");
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		int x = num1.nextInt();
		int y = num2.nextInt();
		if(x>y)
		{
			System.out.println(x+ " is Bigger number");
		}
		else
		{
			System.out.println(y+ " is Bigger number");
		}
		num1.close();
		num2.close();
	}

}
