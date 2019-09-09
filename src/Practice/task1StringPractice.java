package Practice;

import java.util.Scanner;

public class task1StringPractice {
	
	/*
	1. Write a program that calculates the sum of two numbers 
	entered by the user.
	 */
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = input.nextInt();
		System.out.println("Enter second number");
		int b = input.nextInt();
		System.out.println("The sum is: " + (a+b));
		input.getClass();
		
		System.out.println("================================");
		input.close();
		
		
	}

}
