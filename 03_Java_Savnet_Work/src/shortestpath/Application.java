package shortestpath;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		run();
	}

	private static void run() throws CloneNotSupportedException {
		CityRoutes cr = new CityRoutes();
		cr.init();
		List<Route> routes = new ArrayList<>();

		try {
			routes = cr.findRoutes("Timisoara", "Bistrita");
		} catch (CityNotFoundException e) {
			System.out.println("Chek if citys exist!");
		}
		for (Route route : routes) {
			route.show();
			System.out.println();
		}
	}

}
