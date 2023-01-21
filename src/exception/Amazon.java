package exception;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {
		// login with gmail
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter email and password");
		//email 
		//password 
		String email = scr.next();
		String password =scr.next(); 
		
		if(GoogleApi.authenticate(email, password) == true ) {
			System.out.println("Login done ---- Home -----");
		}else {
			System.out.println("Invalid credentials...");
		}
		//google -> verify(email,password) 
	}
}
