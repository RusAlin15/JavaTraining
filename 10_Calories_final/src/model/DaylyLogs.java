package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DaylyLogs implements Serializable {
	private Date date;
	private double totalCalories = 0;
	private List<Log> logList = new ArrayList<>();

	public DaylyLogs(Date date) {
		super();
		this.date = date;
	}

	public void addLog(Log log) {
		logList.add(log);
		totalCalories += log.getTotalCalories();
	}

	@Override
	public String toString() {
		return "Day : " + date + ", Calorii Totale : " + totalCalories + "kCa" + System.lineSeparator() + logList
				+ System.lineSeparator();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DaylyLogs other = (DaylyLogs) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}

}
