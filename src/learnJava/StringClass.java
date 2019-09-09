package learnJava;

public class StringClass {
	
	/*
	 1. String is an object. there are 2 ways we can create object for String class.
	 
     a) String literals ==> String str4 = "Cybertek1" ( When the object is created by string literals,
      that object will be saved at String pool. String pool does not take duplicates)
      
	 b) by using "new" keyboard. ==> String str5 = new String(System.in);
	  (memory location will be created in Java Heap memory)
	  
	  Heap : the place where all the objects are stored at
	  String pool : located in heap memory, store all string literals object
	  
	  2. String object represents the sequences of characters ==> "ABCDEFG".
	  Each Character in String has its own index number. Index Numbers start from 0.
	  
	  String str = "Cybertek"
	  index number: 01234567
	  
	  3. String is immutable: once you declared it, you can not modify it.
	  
	  String methods:
	         a) charAt(indexnum):
	    
	 */
	public static void main(String[] args) {
		String str ="Cybertek";  // will be saved at string pool
		String str1 = "Cybertek"; // will be saved at string pool and one memory location will be created for both.
		System.out.println(str==str1);
		
		String str2 = new String("Cybertek"); // will be saved in Java Heap (out of String pool)
		System.out.println(str==str2); // different memory locations
		
		String str3 = new String ("Cybertek");
		System.out.println(str2==str3);
		
		String str4 = "cybertek";
		System.out.println(str1==str4); // false case sensitivity
				
	}

}
