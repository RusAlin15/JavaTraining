package actions;

import app.ApplicationSession;
import menu.MenuItem;
import model.Database;

public class ViewLogsItem extends MenuItem {

	public ViewLogsItem(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		db.viewDaylyLogs();

	}

}
