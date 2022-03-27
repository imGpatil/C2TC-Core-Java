package assignment2;
import java.util.*;
public class NaturalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number");
		Scanner num1= new Scanner(System.in);
		int x= num1.nextInt();
		int sum=0;
		
		for (int i=1; i<=x; i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of Natural numbers till "+x+" is "+sum);
		
		num1.close();
	}

}
