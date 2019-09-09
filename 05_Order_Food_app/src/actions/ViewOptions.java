package actions;

import app.ApplicationSession;
import menu.MenuItem;
import model.Database;

public class ViewOptions extends MenuItem {

	public ViewOptions(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		db.showOptions();
	}

}
