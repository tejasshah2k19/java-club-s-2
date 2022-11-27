package stringdemo;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {

		String s = "aroyal";
		
		System.out.println((s.charAt(0)+"").matches("[aeiou]"));

		Scanner scr = new Scanner(System.in);
		System.out.println("Enter string with multiple words");
		String str = scr.nextLine();
		System.out.println(str);
		int space = 0;
		// count total space from given string
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				space++;
			}
		}

		System.out.println("total spaces => " + space);
		System.out.println("total words => " + (space + 1));

		String totalWords[] = str.split(" ");
		int words = 0;
		for (int i = 0; i < totalWords.length; i++) {
			System.out.println(totalWords[i]);
			if (totalWords[i].length() != 0) {
				words++;
			}
		}
		System.out.println("total words = > " + words);

	}
}
