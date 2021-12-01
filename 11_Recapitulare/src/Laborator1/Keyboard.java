package Laborator1;

import java.util.Scanner;

public class Keyboard {
	private static Scanner scanner = new Scanner(System.in);

	public static String getMessage(String message) {
		System.out.print(message + " >> ");
		return scanner.nextLine();
	}

	public int getInt(String message) {
		int number;
		System.out.println(message);
		while (true) {
			try {
				number = Integer.parseInt(getMessage("Insert a number"));
				break;
			} catch (NumberFormatException e) {
				System.out.println("This is not a number. Retry!\n");
			}
		}

		return number;
	}

	public double getDouble(String message) {
		double number;
		System.out.println(message);
		while (true) {
			try {
				number = Double.parseDouble(getMessage("Insert a number"));
				break;
			} catch (NumberFormatException e) {
				System.out.println("This is not a number. Retry!\n");
			}
		}

		return number;
	}

}
