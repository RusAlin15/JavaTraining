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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (mounth == null) {
			if (other.mounth != null)
				return false;
		} else if (!mounth.equals(other.mounth))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

}
