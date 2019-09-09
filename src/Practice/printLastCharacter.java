package Practice;
import java.util.Scanner;
public class printLastCharacter {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    
		    System.out.println( word.charAt(word.length()-1) );
	}

}
