package actions;

import app.ApplicationSession;
import app.Keyboard;
import exceptions.NullInputException;
import exceptions.UserExistException;
import menu.MenuItem;
import model.Database;

public class AddUser extends MenuItem {

	public AddUser(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();
		String name = keyboard.getString("Insert user name");

		try {
			db.addUser(name);
		} catch (UserExistException e) {
			System.out.println("User exist");
		} catch (NullInputException e) {
			System.out.println("Insert a name");
		}
	}

}
