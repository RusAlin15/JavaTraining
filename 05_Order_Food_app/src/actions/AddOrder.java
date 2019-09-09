package actions;

import app.ApplicationSession;
import app.Keyboard;
import exceptions.NullInputException;
import exceptions.UserNotExistException;
import menu.MenuItem;
import model.Database;

public class AddOrder extends MenuItem {

	public AddOrder(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		String userName = keyboard.getString("Insert user name");
		try {
			db.existsUserByName(userName);
		} catch (NullInputException e) {
			System.out.println("Insert a name");
		} catch (UserNotExistException e) {
			System.out.println("User not exist");
		}
		String optionsIDs = keyboard.getString("Insert options ID, delimitated by comma");
		db.addOrder(userName, optionsIDs);
	}

}
