package actions;

import app.ApplicationSession;
import app.Keyboard;
import exceptions.NullInputException;
import exceptions.UserNotExistException;
import menu.MenuItem;
import model.Database;

public class DeleteUser extends MenuItem {

	public DeleteUser(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		String name = keyboard.getString("Insert name");

		try {
			db.deleteUser(name);
		} catch (NullInputException e) {
			System.out.println("Insert a name");
		} catch (UserNotExistException e) {
			System.out.println("User not exist");
		}

	}

}
