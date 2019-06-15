package com.project.game.actions;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;
import com.project.game.model.Database;
import com.project.game.model.Player;

public class AddUnitAction extends MenuItem {

	public AddUnitAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Player player = ApplicationSession.getInstance().getSelectedPlayer();
		
	}

}
