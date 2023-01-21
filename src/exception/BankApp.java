package exception;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// signup
		// tejas@icici.com
		// tejas@sbi.com
		// tejas@gmail.com

		// balance s

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter email");
		String email = scr.next();
		if (!email.contains("icici.com")) {
			// exception throw
			EmailException e = new EmailException();
			throw e; // throw obj;
			// throw new EmailException();
		}

		System.out.println("email -> " + email);

		System.out.println("Enter  number");
		int a = scr.nextInt();
		System.out.println(a);

	}

}

// 1) Exception 
// 2) constructor -> parent msg  
//

class EmailException extends RuntimeException {
	public EmailException() {
		super("Invalid Email Exception");
	}
}
