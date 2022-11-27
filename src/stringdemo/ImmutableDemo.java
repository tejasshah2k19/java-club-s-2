package stringdemo;

public class ImmutableDemo {

	public static void main(String[] args) {
		String s = "royal";

		s.toUpperCase(); // operation //call 
		System.out.println(s);// royal

		s = s.toUpperCase();
		System.gc(); // request
		//

		//
		//

		System.out.println(s);
	}
}
