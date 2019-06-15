package com.project.game.menus.generators;

import com.project.game.actions.unitsActions.AddUnitAction;
import com.project.game.menus.BackMenu;
import com.project.game.menus.MenuGenerator;
import com.project.game.menus.MenuItem;

public class AddUnitsMenu extends MenuGenerator {

	public AddUnitsMenu(String option, String key) {
		super(option, key);
	}

	@Override
	public void generateMenu() {
		MenuItem viewArmy = new AddUnitAction ("9", "Soldier");
		BackMenu back = new BackMenu("0", "Back");
		  
		this.addMenuItem(viewArmy);
		this.addMenuItem(back);
		this.setBackAction(back);		
	}
}
