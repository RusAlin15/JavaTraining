package shortestpath;

import java.util.Comparator;

public class SortByDistance implements Comparator<Route> {

	@Override
	public int compare(Route a, Route b) {
		return a.getDistance() - b.getDistance();
	}

}
