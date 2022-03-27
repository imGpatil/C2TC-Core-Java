package assignment2;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your Year");
		Scanner num1= new Scanner(System.in);
		int x= num1.nextInt();
		if(x%4==0)
		{
			System.out.println(x+" is Leap Year");
		}
		else
		{
			System.out.println(x+" is not a Leap Year");
		}
		num1.close();
	}

}
