package com.project.game.actions.menu.playeractions;

import com.project.game.menus.Menu;
import com.project.game.menus.MenuItem;
import com.project.game.menus.generators.UnitsMenu;

public class AddUnit extends MenuItem {

	public AddUnit(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		UnitsMenu addArmyMenu = new UnitsMenu();
		Menu menu = addArmyMenu.generateMenu();
		menu.run();
	}

}
