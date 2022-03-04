package arithmatic;
import java.util.*;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1= new Scanner(System.in);
		Scanner num2= new Scanner(System.in);
		System.out.println("Enter Dividend & Divider");
		int x= num1.nextInt();
		int y= num2.nextInt();
		int z=(x/y);
		System.out.println("Division is "+z);
	}

}
