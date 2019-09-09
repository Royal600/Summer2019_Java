package learnJava;

public class Concatenation {

	
	public static void main(String[] args) {
		/*
		 * String: represents the sequences of characters, used for storing text
		   String values are surrendered by a double quote
		   
		  
		   Concatenation: combining , linking things together ==> ceartes a STring value
		   achieved by using	+ operator
		   we can concat any value to String
		*/
		
		String str = "I am so proud of being " +"part of Cybertek School";
		
		System.out.println(str);
		
		String str1= "Royal";
		System.out.println("My first name is "+str1);
		
		String str2 = "lets check numbers at string " +6+6/3;
		String str3 = "lets check numbers at string " +6+6+3;// String see numbers as charachter
		String str4 = "lets check numbers at string " +6+(6+3);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("I will be SDET employee "+"one day "+ str1);
		String str5= "He has " +'5'+" kids";
		System.out.println(str5); //  if we concat char to String, char is concated as character
		System.out.println("How many days are in a week? " + '7'); 
		System.out.println("64"+'5');
		System.out.println(64 +'5'); //if we concat char to String, char is concated as character
		System.out.println((1+2)+"3"); //33
		System.out.println(7+'3'+5+"QUIZZ" +'2' +2);
		System.out.println(6+5+"Task"+3+4+2);
	}
}
