package stringdemo;

public class StringEqualsDemo {

	public static void main(String[] args) {

		String s1 = "royal";
		String s2 = "royal";
		String s3 = "Royal";

		System.out.println(s1 == s2); // == memory address - reference
		System.out.println(s1 == s3);//

		String s4 = new String("royal");
		System.out.println(s1 == s4);// false

		System.out.println(s1.equals(s4));// value

		s1 = "jai hind";
		System.out.println(s2);

	}
}
/*
 * 
 * compareTo compareToIgnoreCase concat contains startsWith endsWith indexOf
 * lastIndexOf substring replace replaceFirst trim matches
 * 
 */
