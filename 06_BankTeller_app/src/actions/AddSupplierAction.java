package actions;

import java.awt.MenuItem;

import app.ApplicationSession;
import app.Keyboard;
import model.Database;

public class AddSupplierAction extends MenuItem {

	public AddSupplierAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();

		String name = keyboard.getString("Name: ");
		String city = keyboard.getString("City: ");

		Supplier supplier = new Supplier(name, city);
		db.addSupplier(supplier);
	}

}
