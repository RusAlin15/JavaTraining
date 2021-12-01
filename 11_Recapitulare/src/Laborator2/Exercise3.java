//
package Laborator2;

import java.io.FileNotFoundException;

import inputOotputClasses.FileReaderWriter;

public class Exercise3 {
	public static void main(String[] args) {

		try {
			FileReaderWriter file = new FileReaderWriter("ListaProduse");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
