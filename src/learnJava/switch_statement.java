package learnJava;

public class switch_statement {
	public static void main(String[] args) {
		
		int score =3;
		switch (score) {
		case 2:
			System.out.println("2");
			break;
		default:
		 System.out.println("invalid");
		 break;
		case 3:
			System.out.println("3");
			break;
		}
		
		
		String str="Java";
		switch (str) {
		case "Java":
			System.out.println("Java");
			break;
		case "str":
			System.out.println("Javaq");
			break;
		default:
			System.out.println("Invalid");
			break;
		
		}
		
		
	}

}
