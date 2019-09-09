package Practice;
import java.util.Scanner;
public class task3_StringPractice {
	/*
	Write a program that asks user to enter first name 
	and then last name.  At the end system should display user’ 
	full name.
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First name");
		String first = input.nextLine();
		System.out.println("Enter Last Name");
		String last = input.nextLine();
		System.out.println("Full name is " + first + " " + last);
		input.close(); // gets rid of warning of the scanner class
		
		
	}

}
