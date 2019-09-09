package learnJava;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		/*
		 + : addition, adds two numbers together
		 - : subtraction, subtracts a number from another number
		 * : multiplication, multiplies
		 / : devision, devides
		 
		 % : remainder, returns the remainder from the division	
		  
		 */
		int a =500;
		int b= a-200;
		System.out.println(b); //300
		int c= (b-100)/2;
		System.out.println(c); //100
		int d= c%10 +5;
		System.out.println(d); //5
		int e = d+b+c;
		System.out.println(e);
		int f= e%4;
		System.out.println(f);
		double dnum= 10/3;
		System.out.println(dnum); //3.0
		double dnum2=10.0/3;
	    System.out.println(dnum2); //3.3333333333333335
	    double dnum3 = 10/3f;
	    System.out.println(dnum3); //3.3333332538604736
	    System.out.println(1+2+4%8*5);
	    int inum5= 11/3;
	    System.out.println(inum5);
	    
		}

}
