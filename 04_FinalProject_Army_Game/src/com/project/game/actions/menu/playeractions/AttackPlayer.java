package com.project.game.actions.menu.playeractions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.MenuItem;
import com.project.game.model.Database;

public class AttackPlayer extends MenuItem {

	public AttackPlayer(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		System.out.println(db);

		String name = keyboard.getMessage("Insert player name you want to attak.");

		try {
			ApplicationSession.getInstance().setAttackedPlayer(name);
		} catch (RuntimeException e) {
			System.out.println("You can not attack yourself.");
		}

	}

}
