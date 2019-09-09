package learnJava;

public class if_statement_multiBranch {
	
	/*
	  Multi-branch if statement: we use them when there are more than two possibilities
                if(condition1){
                        //A
                } else if(condition2){
                        //B
                }else{
                    // C
                }
            if condition1 is true ==>A
            if condition1 is false and condition2 is true ==> B
            if condition1 and condtion2 both are false ==> C
          
          only one of the blocks get executed. 
          if 1st and 2nd block are true, 
          1st one will be get executed.
	 */
	public static void main(String[] args) {
		
		int a = 17;
		//if first if condition is correct, it will execute first if statement
		if(a>60) {
		System.out.println("you are over 60");}
		//if first one is false and second if condition correct,
		//it will execute second if statement
		else if(a>50) 
		//if 1st and 2nd if conditions are false and 3rd condition is correct,
        //it will execute 3rd if statement
		{System.out.println("you are over 50 "); }
		else if (a>40) 
		{System.out.println("you are over 40");}
		//if all if conditions above are false, it will execute else statement
		else
		{System.out.println("You are young guy");}
		
	}

}
