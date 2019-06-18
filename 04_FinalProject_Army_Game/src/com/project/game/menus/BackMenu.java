package com.project.game.menus;

import com.project.game.app.ApplicationSession;
import com.project.game.model.Database;

public class BackMenu extends MenuItem{

	public BackMenu(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		
		ApplicationSession.getInstance().setSelectedPlayer(null);
		
		//Database db = ApplicationSession.getInstance().getDatabase();
		//ApplicationSession.getInstance().getSerializer().save(db);
	}

}
