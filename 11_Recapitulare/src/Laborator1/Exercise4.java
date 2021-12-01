package Laborator1;

import java.util.ArrayList;
import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();
		ArrayList<Integer> primeNrList = new ArrayList<Integer>();
		Random random = new Random();
		int maximumRange = keyboard.getInt("Introduceti numarul maxim blb bla.");

		primeNrList = generatePrimeList(maximumRange);

		int a, b;
		a = random.nextInt(maximumRange);
		b = random.nextInt(maximumRange);

		System.out.println("Lista numerelor prime pana la numarul " + maximumRange + " este : " + primeNrList);
	}

	private static ArrayList<Integer> generatePrimeList(int upToNumber) {
		ArrayList<Integer> primeNrList = new ArrayList<Integer>();
		for (int i = 1; i <= upToNumber; i++) {
			if (isPrime(i)) {
				primeNrList.add(i);
			}
		}
		return primeNrList;
	}

	private static boolean isPrime(int testNr) {
		for (int i = 2; i < testNr; i++) {
			if (testNr % i == 0) {
				return false;
			}
		}
		return true;
	}

}
