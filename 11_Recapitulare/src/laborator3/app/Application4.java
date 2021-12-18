package laborator3.app;

import java.io.FileNotFoundException;

import inputOotputClasses.FileReaderWriter;

public class Application4 {
	public static void main(String[] args) {

		try {

			FileReaderWriter file = new FileReaderWriter("in_songs.txt");
			ApplicationSession4.getInstance().init(file.extractor());
			ApplicationSession4.getInstance().showSongs();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}