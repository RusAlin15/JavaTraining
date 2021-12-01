//
package Laborator1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Exercise2 {
	public static void main(String[] args) {
		ArrayList<Double> numbersList = null;

		try {
			FileReaderWriter fileBind = new FileReaderWriter("in.txt", "out.txt");
			numbersList = fileBind.extractor();
			System.out.println("Lista numerelor: " + numbersList);
			fileBind.inserter("Lista numerelor: ", numbersList);

			double suma = sumaNumerelor(numbersList);
			System.out.println("Suma numerelor: " + suma);
			fileBind.inserter("Suma numerelor: ", suma);

			double media = mediaNumerelor(numbersList);
			System.out.println("Media aritmetica a numerelor: " + media);
			fileBind.inserter("Media aritmetica a numerelor: ", media);

			double minimum = minimumNumerelor(numbersList);
			System.out.println("Minimum numerelor: " + minimum);
			fileBind.inserter("Minimum numerelor: ", minimum);

			double maximum = maximumNumereleor(numbersList);
			System.out.println("Maximum numerelor: " + maximum);
			fileBind.inserter("Maximum numerelor: ", maximum);

		} catch (FileNotFoundException e) {
			System.out.println("Inexistent File Exception!");
		}
	}

	private static double minimumNumerelor(ArrayList<Double> numbersList) {
		double minimum = Double.MAX_VALUE;
		for (double n : numbersList) {
			if (n < minimum) {
				minimum = n;
			}
		}
		return minimum;
	}

	private static double mediaNumerelor(ArrayList<Double> numbersList) {
		double media = sumaNumerelor(numbersList) / numbersList.size();
		return media;
	}

	private static double maximumNumereleor(ArrayList<Double> numbersList) {
		double maximum = Double.MIN_VALUE;
		for (double n : numbersList) {
			if (n > maximum) {
				maximum = n;
			}
		}
		return maximum;
	}

	private static double sumaNumerelor(ArrayList<Double> numbersList) {
		double suma = 0;
		for (double n : numbersList) {
			suma += n;
		}
		return suma;
	}

}
