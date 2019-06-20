package com.project.game.menus.generators;

import com.project.game.actions.menu.playeractions.AddUnit;
import com.project.game.actions.menu.playeractions.AttackPlayer;
import com.project.game.actions.menu.playeractions.ResetUnits;
import com.project.game.actions.menu.playeractions.Settings;
import com.project.game.actions.menu.playeractions.ViewArmy;
import com.project.game.menus.BackMenu;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuGenerator;
import com.project.game.menus.MenuItem;

public class PlayerMenu extends MenuGenerator {

	@Override
	public Menu generateMenu() {
		Menu menu = new Menu("", "");
		
		MenuItem attackPlayer = new AttackPlayer("1", "Attack Player");
		MenuItem viewArmy = new ViewArmy("2", "View Army");
		MenuItem addUnit = new AddUnit("3", "Add Unit");
		MenuItem resetUnits = new ResetUnits("4", "Reset Units");
		MenuItem settings = new Settings("5", "Settings");
		BackMenu back = new BackMenu("0", "Back");

		menu.addMenuItem(attackPlayer);
		menu.addMenuItem(viewArmy);
		menu.addMenuItem(addUnit);
		menu.addMenuItem(resetUnits);
		menu.addMenuItem(settings);
		menu.addMenuItem(back);
		menu.setBackAction(back);
		return menu;
	}

}
