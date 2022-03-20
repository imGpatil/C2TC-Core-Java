package arithmatic;
import java.util.*;
public class Substraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1=new Scanner(System.in);
		Scanner num2=new Scanner(System.in);
		System.out.println("Enter your numbers");
		int x=num1.nextInt();
		int y=num2.nextInt();
		int z=(x-y);
		System.out.println("Your answer is "+z);
		num1.close();
		num2.close();
	}

}
