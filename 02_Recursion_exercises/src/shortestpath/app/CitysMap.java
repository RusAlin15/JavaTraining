package shortestpath.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CityRoutes {
	List<City> cityRoutes = new ArrayList<>();

	public void init() {
		addRoute("Timisoara", "Deva", 220);
		addRoute("Hateg", "Deva", 60);
		addRoute("Timisoara", "Sibiu", 280);
		addRoute("Deva", "Alba Iulia", 75);
		addRoute("Deva", "Sibiu", 60);
		addRoute("Alba Iulia", "Cluj", 170);
		addRoute("Alba Iulia", "Oradea", 320);
		addRoute("Oradea", "Cluj", 355);
		addRoute("Cluj", "Bistrita", 220);
		addRoute("Bistrita", "Suceava", 180);
		addRoute("Bistrita", "Piatra Neamt", 120);
		addRoute("Piatra Neamt", "Suceava", 160);
		addRoute("Bistrita", "Satu Mare", 240);
		addRoute("Suceava", "Satu Mare", 210);
		addRoute("Satu Mare", "Oradea", 370);
	}

	private void addRoute(String fromName, String toName, int distance) {
		City from = assignCity(fromName);
		City to = assignCity(toName);

		from.addNeighbour(to, distance);
		to.addNeighbour(from, distance);

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

	public City getCityByName(String name) {
		for (City city : cityRoutes) {
			if (city.getName() == name) {
				return city;
			}
		}
		throw new RuntimeException("City not exist!");
	}

	public void show() {
		for (City city : cityRoutes) {
			System.out.print(city);
		}
	}

	public List<Route> findRoutes(String fromName, String toName) {
		City start = takeCity(fromName);
		City end = takeCity(toName);
		Route route = new Route();
		List<Route> routesList = new ArrayList<>();

		find(routesList, route, start, end);
		for (Route rout : routesList) {
			rout.show();
		}
		return routesList;
	}

	private void find(List<Route> routesList, Route route, City start, City end) {
		if (route.contains(start)) {
			return;
		}

		route.add(start);

		if (start.equals(end)) {
			routesList.add(route);
		} else {
			for (Map.Entry<City, Integer> entry : start.getNeighbours().entrySet()) {
				find(routesList, route, entry.getKey(), end);
			}
		}
		route.removeLast();
	}

	private City takeCity(String name) {
		City city = null;
		try {
			city = getCityByName(name);
			return city;
		} catch (Exception e) {
			System.out.println(e);
		}
		throw new RuntimeException();
	}
}
