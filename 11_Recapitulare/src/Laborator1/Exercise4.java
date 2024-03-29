//
package Laborator1;

import java.util.Random;

import inputOotputClasses.Keyboard;

public class Exercise4 {

	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();

		Random random = new Random();
		int maximumRange;
		int a, b, cmmdc;

		maximumRange = keyboard.getInt("Introduceti numarul maxim blb bla.");
		a = random.nextInt(maximumRange);
		b = random.nextInt(maximumRange);

		System.out.println("Primul numar generat aleator : " + a);
		System.out.println("Al 2-lea numar generat aleator : " + b);

		cmmdc = getCmmdc(a, b);
		if (cmmdc == 1) {
			System.out.println("Numerele " + a + " si " + b + " sunt prime intre ele.");
		} else {
			System.out.println("Cel mai mare divizor comun al numereleor " + a + " si " + b + " este : " + cmmdc);
		}

	}

	private static int getCmmdc(int a, int b) {
		if (a >= b) {
			return cmmdc(a, b);
		} else {
			return cmmdc(b, a);
		}
	}

	private static int cmmdc(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return getCmmdc(b, a % b);
		}
	}

}
