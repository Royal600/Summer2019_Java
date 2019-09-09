package learnJava;

import java.util.Scanner;
/*
 Package name: java.util
 class name: Scanner
*/

public class Scannerrrr {
	public static void main(String[] args) {
		/*
		 Scanner class: used for reading user inputs.
		 Scanner class is presented in "java.util" package.
		 In order to use Scanner, we must import it from it's package
		 Import java.util.Scanner; ==> imports scanner only from java.util package
		 Import Statement must be placed between class and package:
		 
		 Example:
		 
		 Package A;
		  import.java.util.Scanner;
		 Public class B {}
		 
		 
		 Wild Import: import java.util.*;
		 imports all the classes within java.util package
		 
		 Declaration of Scanner class:
		    Scanner VariableName =  new Scanner (System.in) ==> creates an object
		                                                        from then Scanner class
		    
		    VariableName : can reference an object of Scanner class
		    
		    Scanner Methods:
		    VariableName.nextByte():
		               returns the user input as Byte value
		    VariableName.nextShort():
		               returns the user input as Short value
		    VariableName.nextInt():
		               returns the user input as Int value
		    VariableName.nextLong():
		               returns the user input as Long value
		    VariableName.nextBoolean():
		               returns the user input as Boolean value
		    VariableName.nextFloat():
		               returns the user input as Float value
		    VariableName.nextDouble():
		               returns the user input as Double value
		    VariableName.nextLine():
		               returns the Entire user input as String value
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter byte Value");
		 byte num=input.nextByte(); // returns user input as byte value, info.nextByte(); ==> also could be used
		System.out.println("Enter short value");
		short num1= input.nextShort();
		System.out.println("Enter Int Value");
		int num2 = input.nextInt();
		System.out.println("Enter Long Value");
		long num4 = input.nextLong();
		System.out.println("Enter Boolean Value");
		boolean num5 = input.nextBoolean();
		System.out.println("Enter Float Value");
		float num6 = input.nextFloat();
		System.out.println("Enter Double Value");
		double num7 = input.nextDouble();
		
		
	
		
		
	
	}

}
