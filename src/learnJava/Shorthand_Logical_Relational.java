package learnJava;

public class Shorthand_Logical_Relational {

	public static void main(String[] args) {
		
		          //SHORTHAND
		/*
		 += : addition assignment:   x+=y   ==>   x=x+y
		 -= : subtraction assignment:  x-=y ==>    x=x-y;
		 *= : Multiplication assignment:   x *= y  ==>    x= x*y
		 /= : division assignment:     x /= y   ==>   x = x/y
		 %= :  Remainder assignment:  x %= y    ==>     x= x%y;
		  
		 x*=y-z =>x=x*(y-z)  
		 */
		int a=210;
		a+=160;//a=a+160
		System.out.println(a); //370
		int b= 630;
		b+=a; //b=b+a
		System.out.println(b);//1000
		int c= 2650;
		c-=b+a;//c=c-b+a
		System.out.println(c);//1280
		int d= 2651;
		d%=c+(a+b); // d=d%(c +(a+b))
		System.out.println(d);//1
		int e= 3000;
		e/= a+c%b-d;//e=e/(a+c%b-d)
		System.out.println(e); //4
		int f = 100;
		f*=a%(c-b)/(d+e);// f=f*(a%(c-b)/(d+e))
		System.out.println(f);
		
		         // Logical Operators
		
		/*
		 && : And  logic        true && true   ==> true
		                        true && false  ==> false
		                        false && false ==> false
		                        false && true  ==> false
		 
		 
		 || : or  logic         
		          				true  || false  ==> true
		          				true  || true   ==> true
		          				false || true   ==> true
		          				false || false  ==> false
			if both conditions are false it will return false, other wise will return true
		 
		     !false == true
		     !true == false
		 */
		
		// &&
		
		boolean aa= 16<3 && "Royal" != "Badboy";
		System.out.println(aa);
		boolean bb= 866/6-(105+3) <= 266 && 76 != 46%(9-2) && "Cybertek" == "does not teach well";
		System.out.println(bb);
		boolean cc = !(!(!(8+5*2>(8+5)*2))) && !("My name is" == "Cavid");
		System.out.println(cc);
		
		// ||
		
		boolean dd = !(!(10*(9%4)<=3)) || !("hello" != "Bye-bye");
		System.out.println(dd);
		
		
		
		// Relational Operators;
		
		 /*Relational Operators: return boolean expression
				 	>  : greater than  
				 	>= : greater than or equal
				 	<  : less than
				 	<= : less than or equal
				 	== : equal
				 	!= : not equal
				 	
				 	=: assign
				 	!: Exclamation mark in java means the logical opposite
				 			NOT
		 */
		
		boolean bnum = 7>6+2;
	    System.out.println(bnum);
		boolean bnum2 = 10-2*3 >= 64%12;
		System.out.println(bnum2);
		boolean bnum3 = 32 <= 3*6 + 10%(1+3);
		System.out.println(bnum3);
		boolean bnum4 = !(12==65) == !(45%(3+5)>2);
		System.out.println(bnum4);
		
		
		
		int inum= 2;
		boolean res = ++inum == 2 || --inum == 2 && --inum ==2;
		System.out.println(res);
		 
	}
}
