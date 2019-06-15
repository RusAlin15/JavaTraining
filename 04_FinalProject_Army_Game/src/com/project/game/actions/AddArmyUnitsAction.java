package com.project.game.actions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.AddUnitTypeMenu;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuItem;
import com.project.game.menus.PlayerMenu;
import com.project.game.model.Database;

public class AddArmyUnitsAction extends MenuItem {

	public AddArmyUnitsAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Menu addArmyTypeMenu = new AddUnitTypeMenu("","");
		addArmyTypeMenu.doAction();
	}

}
