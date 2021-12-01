package Laborator1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Exercise2 {
	public static void main(String[] args) {
		ArrayList<Double> numbersList = null;

		try {
			FileReaderWriter fileBind = new FileReaderWriter("in.txt", "out.txt");
			numbersList = fileBind.extractor();
		} catch (FileNotFoundException e) {
			System.out.println("Inexistent File Exception!");
		}
		System.out.println(numbersList);
	}

}
