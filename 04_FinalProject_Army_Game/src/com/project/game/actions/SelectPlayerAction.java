package com.project.game.actions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuGenerator;
import com.project.game.menus.MenuItem;
import com.project.game.menus.generators.AddUnitsMenu;
import com.project.game.model.Database;

public class SelectPlayerAction extends MenuItem {

	public SelectPlayerAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		Database db = ApplicationSession.getInstance().getDatabase();
		System.out.println(ApplicationSession.getInstance().getDatabase().getPlayers().toString());
		
		String name = keyboard.getMessage("Select Player: ");
		
		while(!db.existPlayerByName(name)) {
			name = keyboard.getMessage("Inexistent player... Enter another name: ");
		}
		
		ApplicationSession.getInstance().setSelectedPlayer(name);
		
		MenuGenerator playerMenu = new AddUnitsMenu("","");
		playerMenu.doAction();
	}

}
