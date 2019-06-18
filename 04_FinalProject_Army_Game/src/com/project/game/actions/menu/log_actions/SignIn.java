package com.project.game.actions.menu.log_actions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuItem;
import com.project.game.menus.generators.PlayerMenu;
import com.project.game.model.Database;

public class SignIn extends MenuItem {

	private Menu menu;

	public SignIn(String option, String key) {
		super(option, key);
		PlayerMenu playerMenu = new PlayerMenu();
		menu = playerMenu.generateMenu();
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		Database db = ApplicationSession.getInstance().getDatabase();

		String name = keyboard.getMessage("Select Player: ");

		while (!db.existPlayerByName(name)) {
			name = keyboard.getMessage("Inexistent player... Enter another name: ");
		}

		ApplicationSession.getInstance().setSelectedPlayer(name);

		menu.run();
	}

}
