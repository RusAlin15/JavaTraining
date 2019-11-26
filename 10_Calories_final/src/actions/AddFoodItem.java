package actions;

import app.ApplicationSession;
import app.Keyboard;
import menu.MenuItem;
import model.Database;
import model.Food;
import model.Unit;

public class AddFoodItem extends MenuItem {

	public AddFoodItem(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard key = ApplicationSession.getInstance().getKeyboard();
		String msg;

		msg = key.getString("Insert food name!");
		String name = msg;

		msg = key.getString("Choose unit form g, ml, kg, buc");
		Unit unit = Unit.valueOf(msg);

		msg = key.getString("Inset caloriesPerUnit");
		double caloriesPerUnit = Double.parseDouble(msg);

		Food food = new Food(name, unit, caloriesPerUnit);
		db.addFood(food);
	}

}
