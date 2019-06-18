package com.project.game.actions.menu.log_actions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.MenuItem;
import com.project.game.model.Database;

public class RemovePlayer extends MenuItem {

	public RemovePlayer(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		Database db = ApplicationSession.getInstance().getDatabase();
		
		String name = keyboard.getMessage("Name: ");
		
		while(!db.existPlayerByName(name)) {
			name = keyboard.getMessage("Inexistent player... Enter another name: ");
		}
		db.removePlayer(db.getPlayerByName(name));
	}

}
