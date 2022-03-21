package arithmatic;
import java.util.*;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1= new Scanner(System.in);
		Scanner num2= new Scanner(System.in);
		System.out.println("Enter your first number");
		int x= num1.nextInt();
		System.out.println("Enter your second number");
		int y= num2.nextInt();
		int z=(x*y);
		System.out.println("Multiplication is "+z);
		num1.close();
		num2.close();
	}

}
