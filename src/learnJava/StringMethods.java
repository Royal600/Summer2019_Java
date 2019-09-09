package learnJava;

public class StringMethods {
	
	/*
	 String Methods:
	 
	 1) charAt (indexnum) : it takes the index number and returns its character as char value
	 example : String str= "Cybertek";
	                        01234567
	 str.charAt(5) == returns 't';
	 
	 2) length() : returns the total number of characters as an int value
	 example:
	 String name="Donald J Trump";
		int n = name.length();
		System.out.println(n);
		
		System.out.println( name.length() ) ==> returns 14
		
	 3) concat(str): it takes a String and concats it to the String Variable, and then returns a new string value
	 
	 example: 
	 String str="Cybertek";
	 str.concat(" school"); ==> "Cybertek school"
	 
	 4) toUpperCase() : converts to upper case, and returns it as a brand new String value
	 
	 example:
	 
	 String N="cybertek";
		N.toUpperCase();
		System.out.println(N); // cybertek, it does not modify, because string is immutable.
		
		N=N.toUpperCase();
		System.out.println(N);// CYBERTEK
		
	5) toLowerCase() : converts to lower case, and returns it as a brand new String value
	
	example:
	
	String B="CYBERTEK";
		B.toLowerCase();
		System.out.println(B); //CYBERTEK, it does not modify, because string is immutable
		
		B=B.toLowerCase();
		System.out.println(B); //cybertek
		
	
	 
	 
	
	 */
	
	public static void main(String[] args) {
		
		String str="Cybertek";
	//index num:    01234567
		//charAt(index) :
		System.out.println(str.charAt(7));
		//you can use both way
		char ch = str.charAt(5);
		System.out.println(ch);
		
		String str2 = "Ro yal";
		             //012345
		System.out.println( str2.charAt(2) );
		
		// length():
		
		String name="Donald J Trump";
		int n = name.length();
		System.out.println(n);
		// you can use both way
		System.out.println( name.length() );
		
		
		// concat() :
		
		String s1= "Cybertek";
		
		s1.concat(" school "); // attempt to modify String s1
		
		System.out.println(s1); // string is immutable thats why it gives you Cybertek
		
		s1 = s1.concat( " school" ); 
		System.out.println(s1); // Cybertek school
		
		// to upper case
		
		String N="cybertek2";
		N.toUpperCase();
		System.out.println(N); // cybertek, it does not modify, because string is immutable.
		
		N=N.toUpperCase();
		System.out.println(N);// CYBERTEK
		
		//toLowerCase(): 
		
		String B="CYBERTEK1";
		B.toLowerCase();
		System.out.println(B); //CYBERTEK, it does not modify, because string is immutable
		
		B=B.toLowerCase();
		System.out.println(B); //cybertek
	}

}
