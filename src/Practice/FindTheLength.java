package Practice;
import java.util.Scanner;
public class FindTheLength {
	public static void main(String[] args) {
		/*
		 Write a program that will output length of the text (string).

	     Example:
	     Display message: "Please enter the text:"
		 input: java
		 Display message: "Length is: 4"
		 */
		Scanner scan = new Scanner (System.in);
		
		 Scanner java =new Scanner(System.in);
		    System.out.println("Please enter the text");
		    String text = java.nextLine();
		    int n = text.length();
		    System.out.println("Length is: " +n);
        
		
		
	}

}
