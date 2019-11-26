package actions;

import app.ApplicationSession;
import app.Keyboard;
import exceptions.FoodNotFoundException;
import menu.MenuItem;
import model.Database;
import model.Date;
import model.DaylyLogs;
import model.Food;
import model.Log;
import model.Timee;
import model.Unit;

public class AddLogItem extends MenuItem {

	public AddLogItem(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard key = ApplicationSession.getInstance().getKeyboard();

		String msg;
		Date date;
		Timee timee;
		Food food;
		double wheight;
		Unit unit;

		try {
			String foodName = key.getString("Insert food name");
			msg = key.getString("Choose unit form g, ml, kg, buc");
			unit = Unit.valueOf(msg);

			food = new Food(foodName, unit, 0);
			food = db.getFoodIfExist(food);

			msg = key.getString("Insert food wheight");
			wheight = Double.parseDouble(msg);

			msg = key.getString("Insert log date. Use dd.mm.yyyy format!");
			date = new Date(msg);

			msg = key.getString("Insert log hour. Use hh.mm format!");
			timee = new Timee(msg);

			Log log = new Log(timee, food, wheight);

			DaylyLogs dayly = new DaylyLogs(date);

			db.addDaylyLog(dayly, log);

		} catch (FoodNotFoundException e1) {
			System.out.println(System.lineSeparator() + "!!!Food you want to insert not exist!!!");
		}

	}

}
