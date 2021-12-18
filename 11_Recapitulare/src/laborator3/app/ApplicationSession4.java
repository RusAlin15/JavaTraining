package laborator3.app;

import java.util.ArrayList;
import java.util.Date;

import laborator3.model.Singer;
import laborator3.model.Song;

public class ApplicationSession4 {
	private ArrayList<Song> songArr = new ArrayList<Song>();

	private static ApplicationSession4 instance = new ApplicationSession4();

	public static ApplicationSession4 getInstance() {
		return instance;
	}

	public ArrayList<Song> getSongArr() {
		return songArr;
	}

	public void init(ArrayList<String> extractor) {
		String[] splitter;

		System.out.println("Note that invalid input data linse were skipped!!!");
		System.out.println("e.g. Missing Names or Misleading Launch Informations");

		for (String line : extractor) {
			if (line == "" || line == null) {
				continue;
			}

			try {
				String name;
				ArrayList<Singer> singers;
				int launchYear;
				long viewsNumber;

				splitter = line.split(";");

				name = initName(splitter[0].trim());
				singers = initSingers(splitter[1].trim());
				launchYear = initLauncYear(splitter[2].trim());
				viewsNumber = initViewsNr(splitter[3].trim());

				Song song = new Song(name, singers, launchYear, viewsNumber);
				songArr.add(song);

				for (Singer s : singers) {
					s.addSong(song);
				}

			} catch (Exception e) {
				System.out.println("Erroressd");
				continue;
			}
		}
	}

	private long initViewsNr(String string) throws Exception {
		// Future validations to be added!!!

		long viewNr;
		viewNr = Long.parseLong(string);
		if (viewNr < 0) {
			throw new Exception();
		}
		return viewNr;
	}

	@SuppressWarnings("deprecation")
	private int initLauncYear(String string) throws Exception {
		// Future validations to be added!!!

		Date date = new Date();
		int year = Integer.parseInt(string);

		if (year > 1800 && year <= (date.getYear() + 1900)) {
			return year;
		} else {
			throw new Exception();
		}
	}

	private ArrayList<Singer> initSingers(String string) throws Exception {

		ArrayList<Singer> singersList = new ArrayList<Singer>();
		Singer singer;
		String singers[];
		singers = string.split("&");
		if (singers == null) {
			throw new Exception();
		}
		for (String name : singers) {
			singer = new Singer(name.trim());
			singersList.add(singer);
		}

		return singersList;
	}

	private String initName(String string) throws Exception {
		if (string == null) {
			throw new Exception();
		}
		return string;
	}

	public void showSongs() {
		for (Song s : songArr) {
			System.out.println(s.getName());
		}
	}

}
