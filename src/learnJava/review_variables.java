package learnJava;

public class review_variables {
	
		public static void main(String[] args) {
			/* A Variable is a program component used to store or represent data.
			 * The number, letter, or other data item in a variable is called its value.
			 * In Java, there are different types of variables, for example: Primitive data types: Byte < short < int < long < float < double,  boolean (true or false), char.
			 *                                                           Non-Primitive data types: String, Arrays, Classes, Interface and etc.
			 *  
			 *  byte	1 byte	Stores whole numbers from -128 to 127
			 *  
	            short	2 bytes	Stores whole numbers from -32,768 to 32,767
	            
				int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
				
				long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
				
				float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
				
				double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
				
				boolean	1 bit	Stores true or false values
				
				char	2 bytes	Stores a single character/letter or ASCII values
				
		   \n (or \r): starts from a new line
		   \t :  horizontal tab
		   \\: prints a back slash
		   \': prints single quote
		   \": prints double quote
		 
		 
		 \: backslash
		 /: front slash
			 */
			
			float fnum= 12e2f; // A floating and Double point number can also be a scientific number with an "e" or "E" to indicate the power of 10
			System.out.println(fnum);
			
			double dnum= 12e4;
			System.out.println(dnum);
			
			int baskets, applesperbasket, totalapples;
			baskets = 12;
			applesperbasket=30;
			totalapples=baskets*applesperbasket;
			
			System.out.println("If i have " + applesperbasket + " apples " + "in each basket and there are " + baskets + " baskets. Then i have total "+ totalapples + " apples");
			
			System.out.println("\\Hello world\\");
			System.out.print("\'Bye Bye world\' \n"); 
			System.out.println("The book is called \t \"The ways of being Leader\"");
			
			char cnum= 47;
			System.out.println(cnum); // prints the character that's corresponding to 47 from ASCII table
			
			char cnum2='9';
			char cnum3='P';
			System.out.println(cnum2); //only time we use '' for char is when we are declaring single character
			System.out.println(cnum3);
			
			char cnum4='b';
			int inum =cnum4;
			System.out.println(inum); // the number that represents b is initalized to the int.
			
			float fnum2=cnum4;
			System.out.println(fnum2); // 98.0
			
			boolean bnum = 100>98;
			System.out.println(bnum);
			
			String snum="Hey Whats up?";
			System.out.println(snum + 9+4);
			System.out.println(snum +(9) +(4));
			System.out.println(snum + (9+4));

			
			
			
			
			
			
	}

}
