package learnJava;

public class If_Statement {
	
	/*
	 Single If Statement:  if (boolean expression)    { some codes to run  } 
	    if block only gets executed if the condition is true
	 
	 
	 */
	
	public static void main(String[] args) {
		 if(9>5) {
			 System.out.println("Hello");
			 System.out.println("Happy friday");
			 System.out.println("Tomorrow is day off");
		}
         
		 int a =1000;
		 if (true) {
			 a = 2000;
			 System.out.println("a is increased");
	          
             }
         System.out.println(a);
         
         int b=127373;
         if (b%2 == 0) {
        	 System.out.print(b);
        	 System.out.println(" is an even number");
         }
         if (b%2!=0) {
        	 System.out.print(b);
        	 System.out.println(" is an odd number");
         }
         String Royal = "GOLD BOY";
         String Boss = "GOLD BOY";
         if (Royal == Boss) 
         {
         System.out.println("Amazing person");
         }
         if (Royal != Boss) {
        	 System.out.println("He is not nice person");
         }
         
         int totalNumber = 20;
         boolean Cybertek = true;
         boolean BestSchool = true;
         if (Cybertek == BestSchool) {
        	 totalNumber+=80;
         }
         if(Cybertek != BestSchool) {
        	 totalNumber-=8;
         }
         System.out.println(totalNumber);
         
         int EligibleAge =18;
         int voteage = 18;
         if (EligibleAge >= voteage) 
        	 System.out.println(" is eligible to vote for D.Trump");
         
         if(EligibleAge < voteage) 
        	 System.out.println(" is not eligible to vote for D.Trump");
         
         
         
         
         
         
          
    }
}

