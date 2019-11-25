package model;

import java.io.Serializable;

public class Date implements Serializable {
	private String day;
	private String mounth;
	private String year;

	public Date(String date) {
		String[] part = date.split("\\.");
		this.day = part[0];
		this.mounth = part[1];
		this.year = part[2];
	}

	@Override
	public String toString() {
		return day + ":" + mounth + ":" + year;
	}

}
