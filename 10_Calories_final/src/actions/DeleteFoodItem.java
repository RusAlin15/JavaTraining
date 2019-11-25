package actions;

import app.ApplicationSession;
import app.Keyboard;
import exceptions.FoodNotFoundException;
import menu.MenuItem;
import model.Database;
import model.Food;

public class DeleteFoodItem extends MenuItem {

	public DeleteFoodItem(String key, String option) {
		super(key, option);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard key = ApplicationSession.getInstance().getKeyboard();
		String foodName;

		foodName = key.getString("Insert food you want to delete!");

		try {
			Food food = db.getFoodByFoodName(foodName);
			db.remove(food);
		} catch (FoodNotFoundException e1) {
			System.out.println("Food you want to delete not exist.");
		}

	}

}
