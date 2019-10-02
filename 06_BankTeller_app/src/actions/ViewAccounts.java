package actions;

import app.ApplicationSession;
import menus.MenuItem;
import model.Database;

public class ViewAccounts extends MenuItem {

	public ViewAccounts(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		db.showAccounts();
	}

}
