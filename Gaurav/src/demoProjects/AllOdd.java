package demoProjects;
import java.util.*;
public class AllOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add limit to odd numbers ");
		Scanner num1 = new Scanner(System.in);
		int x= num1.nextInt(); 
		System.out.println("List of all odd numers from 1 to " +x);
		for (int i=1; i<=x; i++)
		if(i%2 != 0)
		{
		System.out.println(i++);
		}
		num1.close();
	}

}
