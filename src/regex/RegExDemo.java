package regex;

public class RegExDemo {

	// [a-zA-Z0-9]
	// ? -> 0 or 1
	// + -> 1 or N
	// * -> 0 or N

	// isDigit()
	static boolean isDigit(String str) {
		String digit = "[0-9]+";

		return str.matches(digit) && str.length() == 10;

	}
	//"[xX]"
	
	
	static boolean isAlpha(String str) {
		String alpha = "[a-zA-Z]+";// 1 or N
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

		String name = "ra1";//2
		System.out.println("ram -> " + name.matches("[a-z]+"));//a-z 1  [abc]+  "abc"
		
		String email = "[a-zA-Z0-9]+@gmail.com";
	}
}
