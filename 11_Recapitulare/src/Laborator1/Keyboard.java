package Laborator1;

import java.util.Scanner;

public class Keyboard {
	private Scanner scanner = new Scanner(System.in);

	public String getMessage(String message) {
		System.out.print(message + " >> ");
		return scanner.nextLine();
	}

	public int getInt() {
		int number;
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

}
