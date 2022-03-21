package demoProjects;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your age");
		int age=s.nextInt();
		System.out.println("Enter your gender");
		char gender=s.next().charAt(0);
		System.out.println("Enter your phone number");
		long phone=s.nextLong();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Gender "+gender);
		System.out.println("Phone number "+phone);
		s.close();
	}

}
