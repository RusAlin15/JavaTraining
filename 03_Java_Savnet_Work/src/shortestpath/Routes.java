package shortestpath;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Routes {
	private String startName;
	private String endName;
	private List<Route> routes = new ArrayList<>();
	private Route shortestRoute = new Route();
	private Route fastestRoute = new Route();

	public Routes(String start, String end) {
		super();
		this.startName = start;
		this.endName = end;
	}

	private void find(Route route, City start, City end) throws CloneNotSupportedException {
		if (route.contains(start)) {
			return;
		}

		route.add(start);

		if (start.equals(end)) {
			route.caclulateDistance();
			route.caclulateTime();
			Route clone = route.clone();
			routes.add(clone);
		} else {
			for (Map.Entry<City, Integer> entry : start.getNeighbours().entrySet()) {
				find(route, entry.getKey(), end);
			}
		}
		route.removeLast();
	}

	public void findRoutes(CitysMap cr) throws CityNotFoundException, CloneNotSupportedException {
		City start = cr.takeCity(startName);
		City end = cr.takeCity(endName);
		Route route = new Route();

		find(route, start, end);
		setShortestRoute();
		setFastestRoute();
	}

	private void setFastestRoute() throws CloneNotSupportedException {
		for (Route route : routes) {
			if (fastestRoute.getTime() > route.getTime()) {
				fastestRoute = route.clone();
			}
		}
	}

	public void setShortestRoute() throws CloneNotSupportedException {
		for (Route route : routes) {
			if (shortestRoute.getDistance() > route.getDistance()) {
				shortestRoute = route.clone();
			}
		}
	}

	public Route getShortestRoute() {
		return shortestRoute;
	}

	public Route getFastestRoute() {
		return fastestRoute;
	}

	public void show() {
		for (Route route : routes) {
			route.show();
		}
	}

	public String getStart() {
		return startName;
	}

	public String getDestination() {
		return endName;
	}
}
