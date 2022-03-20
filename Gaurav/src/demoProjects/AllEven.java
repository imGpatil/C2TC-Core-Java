package demoProjects;
import java.util.*;
public class AllEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter limit to even numbers ");
		Scanner num1 = new Scanner(System.in);
		int x = num1.nextInt();
		System.out.println("List of all Even numbers from 1 to " +x);
		for (int i=1; i<=x; i++)
			if (i%2 ==0)
			{
				System.out.println(i);
			}
		num1.close();
	}

}
