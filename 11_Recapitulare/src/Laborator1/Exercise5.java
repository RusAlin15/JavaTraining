//
package Laborator1;

import java.util.ArrayList;
import java.util.Random;

import inputOotputClasses.Keyboard;

public class Exercise5 {

	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(0);
		fibonacci.add(1);

		Random random = new Random();
		int maximumRange, randomNumber;

		maximumRange = keyboard.getInt("Introduceti numarul maxim blb bla.");
		randomNumber = random.nextInt(maximumRange);

		fibonacci = getFibonacci(fibonacci, randomNumber);

		if (fibonacci.contains(randomNumber)) {
			System.out.println("Numarul " + randomNumber + " generat aleator apartine sirului Fibonacci");
		} else {
			System.out.println("Numarul " + randomNumber + " generat aleator NU apartine sirului Fibonacci");
		}

	}

	private static ArrayList<Integer> getFibonacci(ArrayList<Integer> fibonacci, int a) {
		int newNumber = newNumberToAdd(fibonacci);
		if (newNumber <= a) {
			fibonacci.add(newNumber);
			return getFibonacci(fibonacci, a);
		}
		return fibonacci;
	}

	private static Integer newNumberToAdd(ArrayList<Integer> fibonacci) {
		return fibonacci.get(fibonacci.size() - 1) + fibonacci.get((fibonacci.size() - 2));
	}

}
