//
package Laborator2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import inputOotputClasses.FileReaderWriter;
import inputOotputClasses.Keyboard;

public class Exercise3 {
	public static void main(String[] args) {
		ArrayList<String> list = null;
		ArrayList<Produs> productList = new ArrayList<Produs>();
		Produs cheapestProduct;
		Produs mostExpenciveProduct;

		try {
			FileReaderWriter file = new FileReaderWriter("ListaProduse.txt", "ListaProdusePretMinMax.txt");
			list = file.extractor();

			productList = castMethod(list);

			cheapestProduct = getCheapestProduct(productList);
			mostExpenciveProduct = getMostExpenciveProduct(productList);

			file.inserter("Cel mai ieftin produs : ", cheapestProduct);
			file.inserter("Cel mai scump produs : ", mostExpenciveProduct);
			file.close();

		} catch (FileNotFoundException e) {
			System.out.println("Errore de citire/scriere fisier!");
			e.printStackTrace();
			return;
		}

		showUnderQuantity(productList);
	}

	private static void showUnderQuantity(ArrayList<Produs> productList) {
		Keyboard keyboard = new Keyboard();
		int quantity = keyboard.getInt("Get Int");
		for (Produs p : productList) {
			if (p.getQuantity() <= quantity) {
				System.out.println(p);
			}
		}

	}

	private static Produs getMostExpenciveProduct(ArrayList<Produs> productList) {
		double maximumprice = Double.MIN_VALUE;
		Produs temporary = null;
		for (Produs p : productList) {
			if (p.getPrice() > maximumprice) {
				maximumprice = p.getPrice();
				temporary = p;
			}
		}
		return temporary;
	}

	private static Produs getCheapestProduct(ArrayList<Produs> productList) {
		Produs temporary = null;
		double minimumPrice = Double.MAX_VALUE;
		for (Produs p : productList) {
			if (p.getPrice() < minimumPrice) {
				minimumPrice = p.getPrice();
				temporary = p;
			}
		}
		return temporary;
	}

	private static ArrayList<Produs> castMethod(ArrayList<String> list) {
		ArrayList<Produs> productList = new ArrayList<Produs>();
		for (String s : list) {
			String[] str = s.split(";");
			productList.add(addPerson(str));
		}
		return productList;
	}

	private static Produs addPerson(String[] str) {
		return new Produs(str[0], Double.parseDouble(str[1]), Integer.parseInt(str[2]));
	}

	private static void afisareString(String[] str) {
		for (String s : str) {
			System.out.print(s + " ");
		}
		System.out.println(System.lineSeparator());
	}
}
