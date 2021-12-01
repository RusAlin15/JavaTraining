package Laborator1;

import java.util.ArrayList;

public class Exercise3 {

	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();
		int number;
		ArrayList<Integer> numberDividersList;

		number = keyboard.getInt("Introduceti un numar pentru care doriti aifsarea divizorilor");

		numberDividersList = getNumberDividersList(number);
		System.out.println("Divizorii numarului " + number + " sunt : " + numberDividersList);
		if (numberDividersList.size() == 2) {
			System.out.println("Numarul " + number + " este numar prim!");
		}
	}

	private static ArrayList<Integer> getNumberDividersList(int number) {
		ArrayList<Integer> numberDividersList = new ArrayList<Integer>();
		for (int d = 1; d <= number; d++) {
			if (number % d == 0) {
				numberDividersList.add(d);
			}
		}
		return numberDividersList;
	}

}
