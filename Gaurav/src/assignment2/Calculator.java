package assignment2;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float z;
		Scanner num=new Scanner(System.in);
		System.out.println("Select the operator +, -, *, /");
		char operator=num.next().charAt(0);
		System.out.println("Enter first number");
		float x= num.nextInt();
		System.out.println("Enter second number");
		float y= num.nextInt();
		switch (operator)
		{
			case '+':
				z=x+y;
				System.out.println(x+" + "+y+" = "+z);
				break;	
				
			case '-':
				z=x-y;
				System.out.println(x+" - "+y+" = "+z);
				break;
				
			case '*':
				z=x*y;
				System.out.println(x+" * "+y+" = "+z);
				break;
				
			case '/':
				z=x/y;
				System.out.println(x+" / "+y+" = "+z);
				break;
				
			default:
				System.out.println("Enter a valid operator among +, -, *, /");
				break;
		}
		num.close();
	}

}
