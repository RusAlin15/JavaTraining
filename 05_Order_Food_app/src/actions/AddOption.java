package actions;

import app.ApplicationSession;
import app.Keyboard;
import menu.MenuItem;
import model.Database;

public class AddOption extends MenuItem {

	public AddOption(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();

		String description = keyboard.getString("Insert Description");
		String deliveryDate = keyboard.getString("Insert delivery date in format DD.MM.YYYY");
		int price = Integer.parseInt(keyboard.getString("Insert order price"));

		db.addOption(description, price, deliveryDate);
	}

}
