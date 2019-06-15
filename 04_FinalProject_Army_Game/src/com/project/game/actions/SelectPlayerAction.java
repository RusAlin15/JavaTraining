package com.project.game.actions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuItem;

public class SelectPlayerAction extends MenuItem {

	public SelectPlayerAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		System.out.println(ApplicationSession.getInstance().getDatabase().getPlayers().toString());
		
		String name = keyboard.getMessage("Select Name: ");
		
		Menu playerMenu = new Menu("","");
		playerMenu.createPlayerMenu();
		playerMenu.doAction();
	}

}
