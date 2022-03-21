package demoProjects;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter name");
		String name= s1.next();
		String rev="";
		int length=name.length();
		for(int i=length-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse order is "+rev);
		s1.close();
	}
	
}
