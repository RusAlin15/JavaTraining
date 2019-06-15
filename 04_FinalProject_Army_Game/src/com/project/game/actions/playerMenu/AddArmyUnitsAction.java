package com.project.game.actions.playerMenu;

import com.project.game.menus.MenuGenerator;
import com.project.game.menus.MenuItem;
import com.project.game.menus.generators.AddUnitsMenu;

public class AddArmyUnitsAction extends MenuItem {

	public AddArmyUnitsAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		MenuGenerator addArmyMenu = new AddUnitsMenu("","");
		addArmyMenu.generateMenu();
		addArmyMenu.doAction();
	}

}
