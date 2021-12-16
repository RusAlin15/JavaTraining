package javaself.minicalculator;

import java.util.Scanner;

public class MiniCalculatorClient {
	public static void main(String[] args) {
		MiniCalculatorClient mini = new MiniCalculatorClient();
		mini.run();

	}

	private void run() {
		MiniCalculator c = new MiniCalculator();
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("(press enter to exit) >>");
				String operation = scanner.nextLine();
				if (operation.length() == 0) {
					break;
				}
				System.out.println(c.doOperation(operation));
			}
		}
	}
}
