package learnJava;

public class if_statement_if_else {
	
	public static void main(String[] args) {
		/*
		 if & else:
		 	
		 		if ( Condition ){
		 				// A statement
		 	//if block only gets executed if the condition is true
		 	 
		 		} 
		 		else { 
		 		
		 		  // B statement
		 // else block only gets executed if the condition is false
		 		   
		 		 }
		 
		 */
		
		int a=8;
		if(a>0) {
			System.out.println("a pozitivdir");}
		 else {
			System.out.println("hgh");
		}
		
		//=========================================
		
		
		int angle1 =150, angle2 = 20, angle3 = 10;
		boolean valid = (angle1+angle2+angle3) ==190;
		
		if(valid) {
			
			System.out.println("it's a valid triangle");
			
		} else {
			
			System.out.println("Invalid triangle, do some math");
			
		
	}
		
		//task
		/*
		 if score <60 ==> failed
		 if score >= 60 less than <90 ==> passed
		 */
         int score = 79;
         if(score>=60) {
        	 System.out.println("Passed");
         } else {
        	 System.out.println("Failed");
         }
        
}
}
