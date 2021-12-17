package laborator3.app;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import inputOotputClasses.FileReaderWriter;

public class Application3 {
	public static void main(String[] args) {
		ArrayList<String> judete;
		try {
			FileReaderWriter file = new FileReaderWriter("judete_in.txt");
			judete = file.extractor();
			Collections.sort(judete);

			viewList(judete);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void viewList(ArrayList<String> judete) {
		for (String s : judete) {
			System.out.println(s);
		}
	}
}
