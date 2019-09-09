package actions;

import app.ApplicationSession;
import app.Keyboard;
import exceptions.IdNotExistException;
import exceptions.NullInputException;
import menu.MenuItem;
import model.Database;

public class DeleteOption extends MenuItem {

	public DeleteOption(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		String id = keyboard.getString("Insert id");

		try {
			db.deleteOption(id);
		} catch (IdNotExistException e) {
			System.out.println("Inexistent option");
		} catch (NullInputException e) {
			System.out.println("Insert option ID");
		}
	}

}
