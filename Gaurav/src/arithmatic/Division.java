package arithmatic;
import java.util.*;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1= new Scanner(System.in);
		Scanner num2= new Scanner(System.in);
		System.out.println("Enter your Dividend");
		float x= num1.nextFloat();
		System.out.println("Enter the divider");
		int y= num2.nextInt();
		float z=(x/y);
		System.out.println("Division is "+z);
		num1.close();
		num2.close();
	}

}
