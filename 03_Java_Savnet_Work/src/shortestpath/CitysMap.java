package shortestpath;

import java.util.ArrayList;
import java.util.List;

public class CitysMap {
	List<City> cityRoutes = new ArrayList<>();

	public void init() {
		addRoute("Timisoara", "Deva", 220, 2);
		addRoute("Hateg", "Deva", 60, 1);
		addRoute("Timisoara", "Sibiu", 280, 3);
		addRoute("Deva", "Alba Iulia", 75, 0.5);
		addRoute("Deva", "Sibiu", 60, 0.4);
		addRoute("Alba Iulia", "Cluj", 170, 1);
		addRoute("Alba Iulia", "Oradea", 320, 4);
		addRoute("Oradea", "Cluj", 355, 2.5);
		addRoute("Cluj", "Bistrita", 220, 1.5);
		addRoute("Bistrita", "Suceava", 180, 2);
		addRoute("Bistrita", "Piatra Neamt", 120, 1);
		addRoute("Piatra Neamt", "Suceava", 160, 1);
		addRoute("Bistrita", "Satu Mare", 240, 3);
		addRoute("Suceava", "Satu Mare", 210, 2);
		addRoute("Satu Mare", "Oradea", 370, 4);
	}

	private void addRoute(String fromName, String toName, int distance, double time) {
		City from = assignCity(fromName);
		City to = assignCity(toName);

		from.addNeighbour(to, distance, time);
		to.addNeighbour(from, distance, time);

	}

	private City assignCity(String name) {
		City city = null;
		try {
			city = getCityByName(name);
		} catch (Exception e) {
			city = new City(name);
			cityRoutes.add(city);
		}
		return city;
	}

	public City getCityByName(String name) throws CityNotFoundException {
		for (City city : cityRoutes) {
			if (city.getName() == name) {
				return city;
			}
		}
		throw new CityNotFoundException();
	}

	public void show() {
		for (City city : cityRoutes) {
			System.out.print(city);
		}
	}

	public City takeCity(String name) throws CityNotFoundException {
		City city = getCityByName(name);
		if (city == null) {
			throw new CityNotFoundException();
		}
		return city;
	}

}
