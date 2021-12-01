package Laborator1;

import java.util.ArrayList;

public class Exercise3 {

	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();
		int number;
		ArrayList<Integer> numberDividersList;

		while (true) {
			try {
				number = Integer.parseInt(keyboard.getMessage("Introduceti un numar natural"));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nu ati introdus un numar natural. Reincercati!\n");
			}
		}

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
