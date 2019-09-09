package Practice;

public class Practice {
	
	public static void main(String[] args) {
		
		int a=-7;
		if(a>0){
			if(a>0&&a<10) {
				System.out.println("A boyukdur 0-dan");
			}
			else if(a==0) {
				System.out.println("a beraberdir 0-a");
			}
			else {
				System.out.println("a boyukdur 10dan");
			}
		}
		else {
			System.out.println("a negativdir");
	}
		
		switch (a) {
		case 9:
			System.out.println("true");
			break;
		case 8:
			System.out.println("True1");
			break;
		default:
			System.out.println("Invalid");
			break;
			}
		
		String b="hello";
		switch(b) {
		default:
			System.out.println("No answer");
			break;
		case "hello":
			System.out.println("hello");
			break;
		case "how are you?":
			System.out.println("how are you?");
			break;
		case"bye-bye":
			System.out.println("bye-bye");
			break;
		}
		
	int apple = 2;
	
	if(apple>8) {
		System.out.println("Expensive");
		}
	
		else if (apple<8&&apple>5) {
			System.out.println("cheap");
		}
		else if (apple<5&&apple>0) {
			System.out.println("very cheap");
	}
	
	/*
	 1. write a program that can display the days
	 		if the day is Monday or Tuesday:
							Java class days
			if the day is Thursday or Friday:
							Selenium class days
			if the day is Wednesday or saturday:
							SQL class days
			otherwise: day off
				(DO NOT use if statement) 
	 */
	
	// boolean, float, long, double can not be used at switch statement
	
	String day = "Thursday";
	switch (day) {
	case "Monday":
	case "Tuesday":
		System.out.println("Java class");
		break;
	case "Wednesday":
	case"Saturday":
		System.out.println("SQL class days");
	    break;
	case"Thursday":
	case"Friday":
		System.out.println("Selenium");
		break;
	default:
		System.out.println("day off");
	}
	
	System.out.println("==========================================================");
	
	/*
	 Declare a variable num, write a java program that can convert numbers to between 0 to 9 to words,
	 if the number is greater than 9 or less than zero output should be "Invalid".
	 
	 Ex: if num = 9         if num=10
	     output: 9          output: Invalid
	 */
	
	
	// by using if statement
	int num = 4;
	String result = "";
	if (num>=0 && num<10) {
	    if(num==9)
			result="nine";
	    else if(num==8)
			result="eight";
	    else if(num==7)
			result="seven";
	    else if(num==6)
			result="six";
	    else if(num==5)
			result="five";
	    else if(num==4)
			result="four";
	    else if(num==3)
			result="three";
	    else if(num==2)
			result="two";
	    else if(num==1)
			result="one";
		else
			result="zero";
	    }else 
	    	result="Invalid";
	
	System.out.println(result);
		
  //by using ternary
	
	int n=12;
	 String result1 = (n==9)? "nine" :(n==8)? "eight"
			         :(n==7)? "seven" :(n==6)? "six"
			         :(n==5)? "five" : (n==4)? "four"
			         :(n==3)? "three" :(n==2)? "two"
			         :(n==1)? "one" :(n==0)? "Zero"
			         :"Invalid";
	 System.out.println(result1);
}
}
