package laborator3.app;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import inputOotputClasses.FileReaderWriter;
import inputOotputClasses.Keyboard;

public class Application3 {
	public static void main(String[] args) {
		ArrayList<String> judete;
		String cautaJudet;
		int indexOfCautaJudet;

		try {
			FileReaderWriter file = new FileReaderWriter("judete_in.txt");
			judete = file.extractor();
			Collections.sort(judete);

			viewList(judete);

			indexOfDistrict(judete);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("static-access")
	private static void indexOfDistrict(ArrayList<String> judete) {
		Keyboard keyboard = new Keyboard();
		String cautaJudet;
		boolean flag = true;

		do {
			System.out.println("\nPlease enter a valid District!");
			cautaJudet = keyboard.getMessage("\nInsert District name: ");
			int indexOf;
//			boolean isMatched = judete.stream().anyMatch(cautaJudet::equalsIgnoreCase);

			for (indexOf = 0; indexOf < judete.size(); indexOf++) {
				if (cautaJudet.equalsIgnoreCase(judete.get(indexOf))) {
					System.out.println("Judetul cautat este pe pozitia: " + indexOf);
					flag = false;
					break;
				}
			}
		} while (flag);

	}

	private static void viewList(ArrayList<String> judete) {
		for (String s : judete) {
			System.out.println(s);
		}
	}
}
