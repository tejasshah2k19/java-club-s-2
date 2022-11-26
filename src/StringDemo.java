import java.util.Scanner;

public class StringDemo {
	public static void main(String[] args) {

		// ctl+shift+f =>formatting
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scr.next(); // next() => single word scan
		System.out.println(name);
		// right click -> run as => java application
		// ctl + shift + F11
		int length = name.length();
		System.out.println("total char => " + length);

		// s1 royal

		// s2 india america
		// same?

		// s1 s2
		// length not same
		//
		System.out.println(name.charAt(0));// 1st
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println("Enter two string");
		String s1 = scr.next();
		String s2 = scr.next();

		boolean isSame = true;

		if (s1.length() != s2.length()) {
			isSame = false;
		} else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					isSame = false;
					break;
				}
			}
		}

		if (isSame) {// isSame == true
			System.out.println("Strings are equal");
		} else {
			System.out.println("not equal");
		}

	}
}
