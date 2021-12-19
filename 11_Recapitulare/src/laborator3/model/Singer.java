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

	public boolean equals(Singer obj) {
		if (this.getName().equals(obj.getName()))
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Singer other = obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
