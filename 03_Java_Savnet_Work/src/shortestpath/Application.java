package shortestpath;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}

	private void run() {
		CityRoutes cr = new CityRoutes();
		cr.init();
		List<Route> routes = new ArrayList<>();
		routes = cr.findRoutes("Timisoara", "Deva");
		for (Route route : routes) {
			route.show();
		}

	}

}
