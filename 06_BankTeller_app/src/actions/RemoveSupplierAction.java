package actions;

import app.ApplicationSession;
import app.Keyboard;
import model.Database;

public class RemoveSupplierAction extends MenuItem {

	public RemoveSupplierAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();

		String name = keyboard.getString("Name: ");

		db.removeBankByName(name);
	}

}
