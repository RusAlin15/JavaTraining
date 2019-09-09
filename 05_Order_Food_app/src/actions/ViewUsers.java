package actions;

import app.ApplicationSession;
import menu.MenuItem;
import model.Database;

public class ViewUsers extends MenuItem {

	public ViewUsers(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		db.showUsers();
	}

}
