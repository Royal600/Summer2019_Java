package Practice;
import java.util.Scanner;
public class printTheLongestWord {
	
	public static void main(String[] args) {
		/*
		 
	Write a program that will print out the longest word.

		 */
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	     
	         int n1= word1.length();
	         int n2= word2.length();
	         
	         if (n1>n2) {
	        	 System.out.println(word1);
	        	 }
	        
	         else {
	        	 System.out.println(word2);
	        	 }
	}

}
