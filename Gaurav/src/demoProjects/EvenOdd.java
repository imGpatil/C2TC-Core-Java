package demoProjects;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num1= new Scanner(System.in);
		System.out.println("Enter your nummber");
		int x= num1.nextInt();
		if (x%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
