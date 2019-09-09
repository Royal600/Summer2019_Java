package Practice;
import java.util.Scanner;
public class PrintFirstAndLastLetters {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    System.out.print( word.charAt(0));
		    System.out.println(word.charAt(word.length()-1) );
		   
	
}
}