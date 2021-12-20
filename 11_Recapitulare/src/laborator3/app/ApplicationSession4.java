package laborator3.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import javax.naming.InvalidNameException;

import inputOotputClasses.Keyboard;
import laborator3.exceptions.InvalidFileLineException;
import laborator3.exceptions.InvalidSingerException;
import laborator3.exceptions.InvalidViewsNumberException;
import laborator3.exceptions.InvalidYearException;
import laborator3.exceptions.SingerNotFoundException;
import laborator3.model.Singer;
import laborator3.model.Song;

public class ApplicationSession4 {
	private ArrayList<Song> songArr = new ArrayList<Song>();
	private ArrayList<Singer> singerArr = new ArrayList<Singer>();

	private static ApplicationSession4 instance = new ApplicationSession4();

	public static ApplicationSession4 getInstance() {
		return instance;
	}

	public void init(ArrayList<String> extractor) {

		System.out.println("Note that invalid input data linse were skipped!!!");
		System.out.println("e.g. Missing Names or Misleading Launch Informations\n");

		for (String line : extractor) {

			try {
				isValidLine(line);

				Song song = constructSong(line);

				store(song);

			} catch (Exception e) {
				continue;
			}
		}

	}

	private void store(Song song) {

		if (songArr.size() == 0) {
			songArr.add(song);
			addSongToSinger(song);
		}

		for (Song so : songArr) {
			if (so.equals(song)) {
				return;
			}
		}

		songArr.add(song);
		addSongToSinger(song);
	}

	private void addSongToSinger(Song song) {
		for (Singer singer : song.getSingers()) {
			singer.addSong(song);
		}
	}

	private Song constructSong(String line)
			throws InvalidViewsNumberException, InvalidYearException, InvalidSingerException, InvalidNameException {
		String[] splitter;
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
		return song;
	}

	private void isValidLine(String line) throws InvalidFileLineException {
		if (line == "" || line == null)
			throw new InvalidFileLineException("Invalid line into file!");
	}

	private long initViewsNr(String string) throws InvalidViewsNumberException {
		long viewNr;
		viewNr = Long.parseLong(string);
		if (viewNr < 0) {
			throw new InvalidViewsNumberException("Invalid YouTube views number!!");
		}
		return viewNr;
	}

	@SuppressWarnings("deprecation")
	private int initLauncYear(String string) throws InvalidYearException {
		// Future validations to be added!!!

		Date date = new Date();
		int year = Integer.parseInt(string);

		if (year > 1800 && year <= (date.getYear() + 1900)) {
			return year;
		} else {
			throw new InvalidYearException("Invalid Year!");
		}
	}

	private ArrayList<Singer> initSingers(String string) throws InvalidSingerException {

		ArrayList<Singer> singersList = new ArrayList<Singer>();
		Singer singer;
		String singers[];
		singers = string.split("&|/");

		if (singers == null) {
			throw new InvalidSingerException("Invalid Singer!");
		}

		for (String name : singers) {

			try {
				singer = returnSingerIfExist(name.trim());
				singersList.add(singer);
			} catch (SingerNotFoundException e) {
				singer = new Singer(name.trim());
				singersList.add(singer);
				singerArr.add(singer);
			}
		}
		return singersList;
	}

	private Singer returnSingerIfExist(String name) throws SingerNotFoundException {
		for (Singer singer : singerArr) {
			if (singer.getName().equalsIgnoreCase(name))
				return singer;
		}
		throw new SingerNotFoundException("SingerNotFound");
	}

	private String initName(String string) throws InvalidNameException {
		if (string == null) {
			throw new InvalidNameException("Invalid Name!!");
		}
		return string;
	}

	public void showAllSongs() {
		for (Song s : songArr) {
			System.out.println(s.toString());
		}
	}

	public void showOrdered() {
		ArrayList<Song> orderedList = songArr;

		Collections.sort(orderedList, (song1, song2) -> {
			return (int) (song1.getViewsNumber() - song2.getViewsNumber());
		});

		for (Song s : orderedList) {
			System.out.println(s.toString());
		}
	}

	public void showOrdered(int i) {
		ArrayList<Song> orderedList = songArr;

		Collections.sort(orderedList, (song1, song2) -> {
			return (int) (song2.getViewsNumber() - song1.getViewsNumber());
		});

		for (Song s : orderedList) {
			System.out.println(s.toString());
		}
	}

	public void showSingerSongs() {
		Keyboard keyboard = new Keyboard();
		String name = keyboard.getMessage("Insert Singer's Name");
		try {
			Singer singer = returnSingerIfExist(name);
			System.out.println("All songs by : " + singer.toString() + "\n");
			System.out.println(singer.toString(2));

			return;
		} catch (SingerNotFoundException e) {
			System.out.println("Please insert a valid artist name!");
		}
	}

}
