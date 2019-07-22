package shortestpath;

import java.util.ArrayList;
import java.util.List;

public class Route implements Cloneable {
	int distance = Integer.MAX_VALUE;
	double time = Double.MAX_VALUE;
	List<City> citys = new ArrayList<>();

	public void add(City city) {
		citys.add(city);
	}

	public void show() {
		for (City city : citys) {
			System.out.print(city);
		}
		System.out.println("  >>" + distance + " km" + " >>" + time + " hours");
	}

	boolean contains(City start) {
		for (City city : citys) {
			if (city.equals(start)) {
				return true;
			}
		}
		return false;
	}

	public void removeLast() {
		citys.remove(citys.size() - 1);
	}

	@Override
	public Route clone() throws CloneNotSupportedException {
		Route clone = new Route();
		clone.citys = new ArrayList<>(this.citys);
		clone.distance = this.distance;
		clone.time = this.time;
		return clone;
	}

	public void caclulateDistance() {
		distance = 0;
		for (int i = 0; i <= citys.size() - 2; i++) {
			City from = citys.get(i);
			City to = citys.get(i + 1);
			distance += from.getDistance(to);
		}

	}

	public int getDistance() {
		return distance;
	}

	public void caclulateTime() {
		time = 0;
		for (int i = 0; i <= citys.size() - 2; i++) {
			City from = citys.get(i);
			City to = citys.get(i + 1);
			time += from.getTime(to);
		}

	}

	public double getTime() {
		return time;
	}
}
