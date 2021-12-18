package laborator3.model;

import java.util.ArrayList;

public class Song {
	private String name;
	private ArrayList<Singer> singers;
	private int launchYear;
	private double viewsNumber;

	public Song(String name, ArrayList<Singer> singers, int launchYear, double viewsNumber) {
		super();
		this.name = name;
		this.singers = singers;
		this.launchYear = launchYear;
		this.viewsNumber = viewsNumber;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Singer> getSingers() {
		return singers;
	}

	public int getLaunchYear() {
		return launchYear;
	}

	public double getViewsNumber() {
		return viewsNumber;
	}

	@Override
	public String toString() {
		return "Song Name: " + getName() + "\nArtists: " + getSingers().toString() + ";\nPublished in: "
				+ getLaunchYear() + "; Youtube views: " + getViewsNumber() + "\n";
	}

}
