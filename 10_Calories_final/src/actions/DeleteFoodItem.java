package actions;

import app.ApplicationSession;
import app.Keyboard;
import exceptions.FoodNotFoundException;
import menu.MenuItem;
import model.Database;
import model.Food;
import model.Unit;

public class DeleteFoodItem extends MenuItem {

	public DeleteFoodItem(String key, String option) {
		super(key, option);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard key = ApplicationSession.getInstance().getKeyboard();
		String msg;
		String foodName;
		Unit unit;

		foodName = key.getString("Insert food you want to delete!");

		msg = key.getString("Choose unit form g, ml, kg, buc");
		unit = Unit.valueOf(msg);

		Food food = new Food(foodName, unit, 0);

		try {
			food = db.getFoodIfExist(food);
			db.remove(food);
		} catch (FoodNotFoundException e1) {
			System.out.println(System.lineSeparator() + "!!!Food you want to delete not exist!!!");
		}

	}

}
