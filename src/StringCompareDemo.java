import java.util.Scanner;

public class StringCompareDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter two strings");
		String s1 = scr.next();
		String s2 = scr.next();
		// ctrl+f11
		boolean ans = s1.equals(s2);// length char by char
		// if strings are same it returns true
		// not same => false
		if (ans == true) {
			System.out.println("EQUAL");
		} else {
			System.out.println("Not Equals");
		}

		// royal roYAL => royal ROYAL
		// RoYal roYal => royal ROYAL
		// ==
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		// toLoweCase()

		ans = s1.equals(s2);
		if (ans == true) {
			System.out.println("EQUAL");
		} else {
			System.out.println("Not Equals");
		}
		
		
		
		ans = s1.equalsIgnoreCase(s2);
		
		
	}
}
