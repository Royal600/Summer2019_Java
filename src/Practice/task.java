package Practice;
import java.util.Scanner;
public class task {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		  write a java program that asks user to enter first and last name,
		  then printout the user's full name in all capital letters
		 */
		
		System.out.println("Enter your first and last name");
		String firstname = scan.nextLine();
		String lastname = scan.nextLine();
		String fullname = firstname + " " + lastname;
		fullname.toUpperCase();
		fullname=fullname.toUpperCase();
		System.out.println("Your full name is "+ fullname);
		
		
	}

}
