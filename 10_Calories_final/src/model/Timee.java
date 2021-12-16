package model;

import java.io.Serializable;

public class Timee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hour;
	private String minute;

	public Timee(String time) {
		String[] part = time.split("\\.");
		this.hour = part[0];
		this.minute = part[1];
	}

	@Override
	public String toString() {
		return hour + ":" + minute;
	}

}
