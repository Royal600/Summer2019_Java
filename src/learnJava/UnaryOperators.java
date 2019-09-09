package learnJava;

public class UnaryOperators {
	
	public static void main(String[] args) {
		/*
		    ++            --
		 Increment and Decrement operators increase and decrease a value stored stored in a number 1.
		 When The operator is placed before the operand it is called "PRE". Example:
		 ++num1 or --num1
		 When the operator is placed after the operand it is called post "Post". Example:
		 num1++  or  num1--
		 */
		//pre increment:  operator is placed before the variable; increase the value by 1 immediately
		int a=5;
		int b=++a;
		System.out.println(b); //6
		int e= ++b + 7;
		System.out.println(e);//14
		//pre decrement:  operator is placed before the variable; decrease the value by 1 immediately
		int c=5;
		int d=--c;
		System.out.println(d); //4
		int t= --d -4*2;
		System.out.println(t);//-5
		//post increment: operator is placed after the variable,
		//it will pass the current value and then increase it by1.
		int inum = 86; //=>87=>88
		int inum1 = inum++;
		System.out.println(inum1); //86 =>87
		int inum2 = inum1++ + inum++; //86+87=173=>174
		System.out.println(inum2);
		int inum3= inum2++ + inum + inum1;
		System.out.println(inum3); //173+88+87=348
		int inum4= inum+inum1+inum2+inum3;//88+87+174+348+697
		System.out.println(inum4);
		//Post-decrement: operator is placed after the variable;
	    //it will pass the current value, and then decrease it by 1
		int num=500;// =>499
		int num1=num--; //500=>499=>498
		System.out.println(num1);
		int num2= num1-- - num; //1=>0
		System.out.println(num2);
		int num3= num2-- + --num1;
		System.out.println(num3); //1+498=499
		int num4= -num + num1/2 + ++num3%3;
		System.out.println(num4);
		
		
		
		
		

		

	}

}
