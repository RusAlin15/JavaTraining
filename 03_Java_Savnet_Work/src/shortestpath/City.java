package shortestpath;

import java.util.HashMap;

public class City {
	private String name;
	private HashMap<City, Integer> neighbours = new HashMap<>();

	public City(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addNeighbour(City city, int distance) {
		neighbours.put(city, distance);
	}

	public HashMap<City, Integer> getNeighbours() {
		return neighbours;
	}

	@Override
	public String toString() {
		return " " + name + " ";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Integer getDistance(City to) {
		return neighbours.get(to);
	}

}
