package regex;

public class RegExDemo {

	

	
	// isDigit()
	static boolean isDigit(String str) {
		String digit ="[0-9]+";
		
		return str.matches(digit) && str.length() == 10;
		
	}
	 
	static boolean isAlpha(String str) {
		String alpha = "[a-zA-Z]+";//1 or N 
		return str.matches(alpha);// true 
	}
	public static void main(String[] args) {
	
		
		String str = "royal";
		System.out.println(RegExDemo.isAlpha("royal"));
		System.out.println(RegExDemo.isAlpha("123"));
		System.out.println(RegExDemo.isAlpha("p90"));

		System.out.println(RegExDemo.isAlpha("royalKL"));
		
		System.out.println("digit");
		
		System.out.println(RegExDemo.isDigit("13"));
		
		System.out.println(RegExDemo.isDigit("123456789p"));
		System.out.println(RegExDemo.isDigit("1234567890"));

		

	}
}


