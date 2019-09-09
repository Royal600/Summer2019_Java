package learnJava;

public class if_statement_nested_if {
	/*
	  Nested if statements means an if statement inside an if statement.
	   Yes, java allows us to nest if statements within if statements. i.e, 
	   we can place an if statement inside another if statement.
	   PAY ATTENTION TO CURLY BRACES!!!
	 */
	
	
	public static void main(String[] args) {
		int a=106;
		int b=37;
		int c= -5;
		
		//first if statement
		if(a>100) {
		System.out.println("a is over 100 and is true");
		
		// Nested - if statement 
     
		// Will only be executed if statement above is true
		if(b==100) {
			System.out.println("b is under 100 and is true");
		if (c<0) {
			System.out.println("c is ngeative and is true");
		}
		}
		}
		//if first if condition is wrong, it will execute else statement
		//if second if condition is wrong, it will execute only first if statement
		//if third if condition is wrong, it will execute only first and second if statements
		//if all if conditions are correct, it will execute all three if statements
		else {
			System.out.println("all of it is wrong");
		}
		
int grade = 0;
		
		if( grade >= 60 && grade <= 100) {
			System.out.println("you passed");
			
			if( grade >=90 && grade <= 100) {
				System.out.println("\twith a grade of A");
				
			} 
			else if(grade >=80 && grade < 90) {
				System.out.println("\twith a grade of B");
			}
			else if(grade >= 70 && grade < 80) {
				System.out.println("\twith a grade of C");
			}
			else {  // 60 <= grade < 70
				System.out.println("\t with a grade of D");
			}
			
		}
		else {  // either less than 60 or greater than 100
			
			if(grade < 60) {
				System.out.println("You failed with a grade of F");
			}
			else { // greater than 100
				System.out.println("Invalid score, error 404");
			}

	  }

	}
}
