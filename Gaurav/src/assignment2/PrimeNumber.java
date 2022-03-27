package assignment2;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);
		System.out.println("Enter your number");
		int x= num.nextInt();
		int temp=0;
		
		for(int i=2; i<=x-1; i++)
		{
			if (x%i==0)
			{
				temp=temp+1;
			}
		}
		if (temp==0)
		{
			System.out.println(x+" is a Prime Number");
		}
		else
		{
			System.out.println(x+" is not a Prime Number");
		}
		num.close();
	}

}
