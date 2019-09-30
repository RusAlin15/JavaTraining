package app;

import java.util.Scanner;

public class Keyboard {
	private Scanner scanner = new Scanner(System.in);

	public String getString(String message) {
		System.out.print(message);
		String s = scanner.nextLine();
		return s;
	}
}
