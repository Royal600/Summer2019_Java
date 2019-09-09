package Practice;
import java.util.Scanner;
public class switchChar {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter command:");
		    char response = scan.next().charAt(0);
		    //WRITE YOUR CODE HERE 
		    if (response=='y') {
		    	System.out.println("Your request is being processed");
		    }
		    else if(response == 'n') {
		    	System.out.println("Thank you anyway for your consideration");
		    }
		    else if(response == 'h') {
		    	System.out.println("Sorry, no help is currently available");
		    }
		    else {
		    	System.out.println("Invalid entry, please try again!");
		    }
	} 

}
