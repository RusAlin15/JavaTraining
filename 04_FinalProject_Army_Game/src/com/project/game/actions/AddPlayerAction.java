package com.project.game.actions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.MenuItem;
import com.project.game.model.Database;
import com.project.game.model.Player;

public class AddPlayerAction extends MenuItem {

	public AddPlayerAction(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Keyboard keboard = ApplicationSession.getInstance().getKeboard();
		Database database = ApplicationSession.getInstance().getDatabase();
		
		String name = keboard.getMessage("Name: ");
		
		database.addPlayer(new Player(name));
	}

}
