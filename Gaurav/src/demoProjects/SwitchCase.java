package demoProjects;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the product number");
		Scanner num1= new Scanner (System.in);
		int x = num1.nextInt();
		
		switch (x)
		{
			case 1:
				System.out.println("Product "+x+" is available");
				break;
			case 2:
				System.out.println("Product "+x+" is available");;
				break;
			case 3:
				System.out.println("Product "+x+" is available");
				break;
			default:
				System.out.println("Not available");
				break;
		}
		num1.close();
	}

}
