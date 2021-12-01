package Laborator1;

import java.util.Scanner;

public class Keyboard {
	private Scanner scanner = new Scanner(System.in);

	public String getMessage(String message) {
		System.out.print(message + " >> ");
		return scanner.nextLine();
	}

	public int getInt(String message) {
		int number;
		while (true) {
			try {
				number = Integer.parseInt(getMessage("Introduceti un numar natural"));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nu ati introdus un numar natural. Reincercati!\n");
			}
		}

		return number;
	}

}
