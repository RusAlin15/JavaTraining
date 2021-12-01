package Laborator1;

import java.util.Scanner;

public class Keyboard {
	private static Scanner scanner = new Scanner(System.in);

	public static String getMessage(String message) {
		System.out.print(message + " >> ");
		return scanner.nextLine();
	}

}
