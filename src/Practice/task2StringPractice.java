package Practice;
import java.util.Scanner;
public class task2StringPractice {
	
	public static void main(String[] args) {
		
		/*
		 2. Write a program that asks user to enter three numbers 
		 		and returns the largest number.
					Do it with ternary
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num1");
		double a = input.nextDouble();
		
		System.out.println("Enter num2");
		double b = input.nextDouble();
		
		System.out.println("Enter num3");
		double c = input.nextDouble();
		
		double largest = (a>b && a>c)?a
				        :(b>a && b>c)?b
				        :c;
		System.out.println("Largest number is "+largest);
		input.close();
		
		
		
	}

}
