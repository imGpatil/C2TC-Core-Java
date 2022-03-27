package assignment2;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 3 Digit number");
		Scanner num1= new Scanner (System.in);
		int x= num1.nextInt();
		int temp=x, sum=0, crdig;
		
		while(x!=0)
		{
			crdig=x%10;
			sum=sum+(crdig*crdig*crdig);
			x=x/10;
		}
		if (sum==temp)
			System.out.println(temp+" is Armstrong");
		else
			System.out.println(temp+" is not Armstrong");
		num1.close();
	}

}
