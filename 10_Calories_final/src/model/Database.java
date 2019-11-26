package model;

import exceptions.FoodNotFoundException;

public interface Database {

	void addFood(Food food);

	void viewFood();

	void remove(Food foodName) throws FoodNotFoundException;

	Food getFoodIfExist(Food food) throws FoodNotFoundException;

	void addDaylyLog(DaylyLogs dayly, Log log);

	void viewDaylyLogs();

}
