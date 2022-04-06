package demoProjects;
import java.util.*;
public class ArrayInput {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size= s.nextInt();
		int array[]= new int[99];
		
		System.out.println("Enter your elements ");
		for(int i=0; i<size; i++)
		{
			array[i]= s.nextInt();
		}
		for(int i=0; i<size; i++)
		{
			System.out.println("Your ArrayList---> "+array[i]);
		}
		s.close();
	}

}
