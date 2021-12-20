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

	public boolean contains(Song obj) {
		if (this.getName() == obj.getName())
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + launchYear;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((singers == null) ? 0 : singers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (launchYear != other.launchYear)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (singers == null) {
			if (other.singers != null)
				return false;
		} else if (equalSingers(other))
			return false;
		return true;
	}

	private boolean equalSingers(Song other) {
		for (Singer s : singers) {
			if (!other.singers.contains(s)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "Song Name: " + getName() + "\nArtists: " + getSingers().toString() + ";\nPublished in: "
				+ getLaunchYear() + "; Youtube views: " + getViewsNumber() + "\n";
	}

}
