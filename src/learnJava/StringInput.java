package learnJava;

import java.util.Scanner;
/*
 next()  &  nextLine()  ==> returns String value
 
 variableName.nextline(); ==> returns the Entire input as String value
 variableName.next(); ==> returns the first word of user input as String Value
 */
public class StringInput {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String firstName = input.nextLine();
		System.out.println("Enter Last Name");
		String LastName = input.nextLine();
		System.out.println("first name is: "+firstName);
		System.out.println("LastName is: " +LastName);
		
	// 	char ch= input.next().charAt(0);
		
	}

}
