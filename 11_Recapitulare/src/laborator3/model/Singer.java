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

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Singer other = (Singer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

	public String toString(int i) {
		String message = "";
		for (Song song : songsList) {
			message += song.toString() + "\n";
		}
		return message;
	}

}
