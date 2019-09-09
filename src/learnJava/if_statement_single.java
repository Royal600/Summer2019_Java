package learnJava;

public class if_statement_single {

	public static void main(String[] args) {
		
		/*
		 single if:
		 		if ( boolean expression)  { 
		 				// A
		 		}
		 */
		
		if (6*3>15/3)
			System.out.println("18 is larger than 5");
		
		if (100>99)
			System.out.println("100 is bigger than 99");
		
		//===================================================================
		
		//solution 1:
		int num1=1000,num2=500, num3=800;
		int maximum = 0;
		if(num1>num2&&num1>num3) {
			maximum=num1;
		}
		if(num2>num1&&num2>num3) {
			maximum=num2;
		}
		if(num3>num2&&num3>num1) {
			maximum=num3;
		}
		System.out.println("Maximum number between "+num1+" ," +num2+" and "+num3+" is "+maximum);
		
		// Solution 2:
		if (num1>num2&&num1>num3){
			System.out.println("Maximum numer is "+num1);
		}
		
		//REMEMBER IT!!!
		int statuscode = 203;
		String finalresult="Invalid Status code";
		if(statuscode==400) {
			finalresult ="ok";
		}
		if(statuscode==203) {
			finalresult="accepted";
		}
		System.out.println("statuscode " +finalresult);
		
		
	
	}
}
