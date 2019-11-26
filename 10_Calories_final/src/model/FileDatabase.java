package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import app.ApplicationSession;
import exceptions.FoodNotFoundException;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Food> foodList = new ArrayList<>();
	private List<DaylyLogs> daylyLogs = new ArrayList<>();

	@Override
	public void addFood(Food food) {
		foodList.add(food);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public void viewFood() {
		System.out.println(foodList.toString());
	}

	@Override
	public void remove(Food foodName) {
		foodList.remove(foodName);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public Food getFoodIfExist(Food food) throws FoodNotFoundException {
		for (Food it : foodList) {
			if (it.equals(food)) {
				return it;
			}
		}
		throw new FoodNotFoundException();

	}

	@Override
	public void addDaylyLog(DaylyLogs dayly, Log log) {
		for (DaylyLogs dly : daylyLogs) {
			if (dly.equals(dayly)) {
				dly.addLog(log);
				return;
			}
		}
		dayly.addLog(log);
		daylyLogs.add(dayly);

		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public void viewDaylyLogs() {
		System.out.println(daylyLogs.toString());
	}
}