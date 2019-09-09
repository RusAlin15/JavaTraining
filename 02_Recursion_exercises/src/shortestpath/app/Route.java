package shortestpath.app;

import java.util.ArrayList;
import java.util.List;

public class Route {
	List<City> route = new ArrayList<>();

	public void add(City city) {
		route.add(city);
	}

	public void show() {
		for (City city : route) {
			System.out.print(city);
		}
	}

	boolean contains(City start) {
		for (City city : route) {
			if (city.equals(start)) {
				return true;
			}
		}
		return false;
	}

	public void removeLast() {
		route.remove(route.size() - 1);
	}

}
