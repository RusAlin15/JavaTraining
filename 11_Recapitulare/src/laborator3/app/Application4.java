package laborator3.app;

import java.io.FileNotFoundException;

import inputOotputClasses.FileReaderWriter;

public class Application4 {
	public static void main(String[] args) {

		try {
			FileReaderWriter file = new FileReaderWriter("in_songs.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}