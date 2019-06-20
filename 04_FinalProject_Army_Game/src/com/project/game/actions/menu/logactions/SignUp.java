package com.project.game.actions.menu.logactions;


import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.MenuItem;
import com.project.game.model.Database;
import com.project.game.model.Player;

public class SignUp extends MenuItem {

	public SignUp(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		Database db = ApplicationSession.getInstance().getDatabase();
		String name = keyboard.getMessage("Name: ");
		
		while(db.existPlayerByName(name)) {
			name = keyboard.getMessage("Player exist... Enter another name: ");
		}
		
		db.addPlayer(new Player(name));
	}

}
