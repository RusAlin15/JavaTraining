package actions;

import app.ApplicationSession;
import menu.MenuItem;
import model.Database;

public class ViewFoodItem extends MenuItem {

	public ViewFoodItem(String key, String option) {
		super(key, option);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		db.viewFood();
	}

}
