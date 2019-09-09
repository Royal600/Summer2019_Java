package learnJava;

import java.util.Scanner;

//everything in Scanner class is imported

public class Ternary_Scanner {
	public static void main(String[] args) {
		
		     // TERNARY
		
		
		/*
	     If statement convert to Ternary
	     
		 if(condition) ==> (condition)?
		 else          ==>  :
		 else if       ==>  :(Condition)?
		 
		 in ternary's body we can only give a single value
		 
		 ternary must be initialized to a variable,must return a value
	 
	 */
		
		int num= 0;
		
		if(true) {
			num=100;
		}else {
			num=50;
		}
		// we will convert this statement to ternary
		
		int n = (false)? 100 : 50;
		int y = false ? 100 : 20;//  in ternary you might not give parenthesis() to condition
		System.out.println(y);
		
		System.out.println(num);
		System.out.println(n);
		
		System.out.println("========================================================");
		
		String Schoolname="";
		
		boolean Batch12 = false;
		if (Batch12) {
			Schoolname = "Cybertek";
		}else {
			Schoolname="Invalid";
		}
		// convert it to ternary
		
		// VALUE MUST BE INITIALIZED TO VARIABLE OR PRINTIED OUT
	   System.out.println( Batch12 ? "Cybertek" : "Invalid"); // PRINTIED OUT OPTION
	   
	   String BestSchool = Batch12 ? "Cybertek" : "Invalid"; // initialized to variable option
	   
	   System.out.println(BestSchool);
	   
	   /*
	    *  if you have only single if statement you can not apply it to ternary. 
	    *  Because in ternary total number of question mark and column has to be equal.
	    *  if you use one question mark, meanwhile you have to also use one column
	    */
	   double interestRate = 0;
	   boolean goodCredit = true;
	   
	   System.out.println(goodCredit ? 0.5 : 0.9);
	   double interestRate1 = goodCredit ? 0.3 : 0.9;
	   System.out.println(interestRate1);
	   
	   byte grade = 62;
	   boolean passed = grade >60 ? true : false;
	   System.out.println(passed);
	   
	   char finalGrade ='C';
	   String GoToMarket= "";
	   
	  /* if(finalGrade =='A') {
		   GoToMarket ="As Early bird";
		   }else if(finalGrade =='B'){
			   GoToMarket = "Group1";
		   }else if(finalGrade=='C'){
			   GoToMarket="Group2";
		    }else{
		        GoToMarket="After Group 2";
		    }*/
		    
	   
	   System.out.println((finalGrade == 'A') ? "Early Bird" : (finalGrade == 'B') ? "Group1" : "After Group 1");
	   
	   
	   String Group = (finalGrade == 'A') ? "Early Bird" : (finalGrade == 'B') ? "Group1" : "After Group 1";
	   System.out.println(Group);
	   
	  String Group1 = (finalGrade == 'A') ? "Early Bird" : (finalGrade == 'B') ? "Group1" : (finalGrade == 'C') ? "Group2" 
			   : "After Group 1";
	  System.out.println(Group1);
	  
	  int score = 9;
	  char EndScore = ' ';
	  
	 /*
	  if(score>=90 && score<=100) {
		  Finals ='A';
	  }else if(score>=80 && score <=89){
		  Finals='B';
		   } else if(score>=70 && score <=79) {
			   Finals='C';
		   }else if (score>=60 && score <=69) {
			   Finals='D';
		   }else if(score>=0 && score <=59) {
			   Finals='F';
		   }else {
			   Finals=' ';
		   }*/
		  
	  /*(score>=90 && score <=100) ? 'A' :
		  (score>=80 && score <=89)? 'B' :
        	  (score>=70 && score <=79)? 'C':
        		  (score>=60 && score <=69)? 'D':
        			  (score>=0 && score <=59)? 'F': ' ';)*/
	  score =78;
	  EndScore = (score>=90 && score <=100) ? 'A'
			  :(score>=80 && score <=89) ? 'B'
		        :(score>=70 && score <=79) ? 'C'
		          :(score>=60 && score <=69) ? 'D'
		            :(score>=0 && score <=59) ? 'F'
		            		: ' ';
	System.out.println(EndScore);
	
	int n1= 100, n2=2300, n3=400;
	int max = (n1>n2 && n1>n3)? n1
			:(n2>n1 && n2>n3)? n2
					:n3;
	System.out.println(max);
	
	
	   // SCANNER
	
	/*
	 It is the class that provides the methods to get user inputs
	 
	 Scanner class presented in package "java.util" package
	 
	 in order to use Scanner class, the scanner class MUST be imported 
	 
	 in order to import :  import java.util.Scanner;
	 
	 the import Statement MUST be placed between package and class name
	 
	 declaration of Scanner:
	         Scanner VariableName = new Scanner(System.in);
	         VariableName: can reference an object of The Scanner class
	         new Scanner(System.in): creates the object of the scanner class
	  methods of Scanner class:
	       VariableName.nextByte()  ==> allows user to enter Byte value
	       
	 */
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a Byte Value");
	byte byteNum1 = input.nextByte();
	System.out.println("You have entered: "+byteNum1);
	
	System.out.println("Enter another Byte Value 1");
	byte byteNum2 = input.nextByte();
	System.out.println("You have entered: "+byteNum2);
	
	System.out.println("Addition is: " +(byteNum1 +byteNum2));
	
	
					
        				  
	   
	   
	}

}
