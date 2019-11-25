package model;

import exceptions.FoodNotFoundException;

public interface Database {

	void addFood(Food food);

	void viewFood();

	void remove(Food foodName) throws FoodNotFoundException;

	Food getFoodByFoodName(String foodName) throws FoodNotFoundException;

}
