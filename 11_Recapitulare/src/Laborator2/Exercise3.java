//
package Laborator2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import inputOotputClasses.FileReaderWriter;

public class Exercise3 {
	public static void main(String[] args) {

		ArrayList<Produs> productList = new ArrayList<Produs>();
		try {
			FileReaderWriter file = new FileReaderWriter("ListaProduse.txt", "ListaProdusePretMinMax.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
