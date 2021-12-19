package laborator3.model;

import java.util.ArrayList;

public class Singer {

	private String name;
	private ArrayList<Song> songsList = new ArrayList<Song>();

	public Singer(String name) {
		this.name = name;
	}

	public void addSong(Song song) {
		songsList.add(song);
	}

	private String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
