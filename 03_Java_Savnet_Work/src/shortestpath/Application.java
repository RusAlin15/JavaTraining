package shortestpath;

public class Application {
	private static CitysMap cr = new CitysMap();

	public static void main(String[] args) throws CloneNotSupportedException {
		cr.init();
		Routes routes = new Routes("Timisoara", "Oradea");
		search(routes);

		Routes routes1 = new Routes("Timisoara", "Arad");
		search(routes1);
	}

	private static void search(Routes routes) throws CloneNotSupportedException {

		try {
			routes.findRoutes(cr);

			System.out.println("Shortest route is...");
			routes.getShortestRoute().show();

			System.out.println();

			System.out.println("Fastest route is...");
			routes.getFastestRoute().show();
			System.out.println();
		} catch (CityNotFoundException e) {
			System.out
					.println("Check if " + routes.getStart() + " or " + routes.getDestination() + " exist on the map!");
		}

	}

}
