package learnJava;

public class Casting_Training {


	public static void main(String[] args) {
		/*
		 Type casting is when you assign a value of one primitive data type to another type.
		 In Java, there are two types of casting:

		Widening Casting (automatically) - converting a smaller type to a larger type size
		byte -> short -> char -> int -> long -> float -> double

		Narrowing Casting (manually) - converting a larger type to a smaller size type
		double -> float -> long -> int -> char -> short -> byte

		 */ 
		
		byte bnum= 89;
		short snum=bnum;
		System.out.println(snum); //Widening Casting;
		
		long snum2=198;
		int inum2 =(short) snum2;
		System.out.println(inum2); //narrowing casting
		
		char cnum = 'd';
		short inum = (byte) cnum;
		System.out.println(inum); //the value will be represented as In ASCII TABLE
		
		double dnum = 1829;
		float fnum = (float)dnum;
		System.out.println(fnum);
		
		int inum3 = 66673;
		float fnum2 = inum3;
		System.out.println(fnum2);
		
		
		
		
		
		
		
	}
	
	

}
