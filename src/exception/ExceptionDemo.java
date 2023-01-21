package exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter two numbers");

		try {
			int a = scr.nextInt();// jre throw 10.20
			int b = scr.nextInt();
			// Array Exception
			int c = a / b;// jre throw
			System.out.println("div = " + c);
		} catch (ArithmeticException e) {
			System.out.println("Plz do not enter zero...........");
		} catch (InputMismatchException e) {
			System.out.println("Please enter only integers...");
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			System.out.println("Please Try AfterSomTime....");
			// sendMailToDeveloper(exception);
		}

	}
}
//int [3]-> scan print sum -> exception  