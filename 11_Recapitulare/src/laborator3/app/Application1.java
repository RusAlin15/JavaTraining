package laborator3.app;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import inputOotputClasses.FileReaderWriter;
import inputOotputClasses.Keyboard;
import laborator3.model.Verse;

public class Application1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Verse> versesList = new ArrayList<Verse>();

		try {
			FileReaderWriter fileBind = new FileReaderWriter("cantec_in.txt", "cantec_out.txt");
			list = fileBind.extractor();

			versesList = castMethod(list);

			versesInit(versesList);

			for (Verse v : versesList) {
				fileBind.inserter("", v);
			}

			fileBind.close();
		} catch (FileNotFoundException e) {
			System.out.println("Inexistent File Exception!");
			e.printStackTrace();
			return;
		}
	}

	@SuppressWarnings("static-access")
	private static void versesInit(ArrayList<Verse> versesList) {
		String word;
		Keyboard keyboard = new Keyboard();
		word = keyboard.getMessage("Insert a word");

		for (Verse v : versesList) {
			v.initWordsNumber();
			v.initVowelsNumber();
			v.generateRandomUperCase();
			v.addStarIf(word);

		}
	}

	private static ArrayList<Verse> castMethod(ArrayList<String> list) {
		ArrayList<Verse> versesList = new ArrayList<Verse>();
		for (String s : list) {
			versesList.add(new Verse(s));
		}
		return versesList;
	}
}
