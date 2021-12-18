package laborator3.model;

import java.util.ArrayList;

public class Song {
	private String name;
	ArrayList<Singer> singers;
	int launchYear;
	double viewsNumber;

	public Song(String name, ArrayList<Singer> singers, int launchYear, double viewsNumber) {
		super();
		this.name = name;
		this.singers = singers;
		this.launchYear = launchYear;
		this.viewsNumber = viewsNumber;
	}

	public int getLaunchYear() {
		return launchYear;
	}

	public void setLaunchYear(int launchYear) {
		this.launchYear = launchYear;
	}

	public double getViewsNumber() {
		return viewsNumber;
	}

	public void setViewsNumber(double viewsNumber) {
		this.viewsNumber = viewsNumber;
	}

	@Override
	public String toString() {
		return "-> " + name + ", singers: " + singers + ", launchYear: " + launchYear + ", viewsNumber: " + viewsNumber;
	}

}
