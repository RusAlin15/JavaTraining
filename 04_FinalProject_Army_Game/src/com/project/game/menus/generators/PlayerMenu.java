package com.project.game.menus.generators;

import com.project.game.actions.playerActions.AddArmyUnitsAction;
import com.project.game.actions.playerActions.AttackArmyUnitsAction;
import com.project.game.actions.playerActions.RemoveArmyUnitsAction;
import com.project.game.actions.playerActions.ViewArmyUnitsAction;
import com.project.game.menus.BackMenu;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuGenerator;
import com.project.game.menus.MenuItem;

public class PlayerMenu extends MenuGenerator {

	@Override
	public Menu generateMenu() {
		Menu menu = new Menu("", "");
		MenuItem viewArmy = new ViewArmyUnitsAction("9", "View Army Unists");
		MenuItem addArmy = new AddArmyUnitsAction("8", "Add Army Unit");
		MenuItem removeArmy = new RemoveArmyUnitsAction("7", "Remove Army Unit");
		MenuItem attackPlayer = new AttackArmyUnitsAction("6", "Attack Player");
		BackMenu back = new BackMenu("0", "Back");

		menu.addMenuItem(viewArmy);
		menu.addMenuItem(addArmy);
		menu.addMenuItem(removeArmy);
		menu.addMenuItem(attackPlayer);
		menu.addMenuItem(back);
		menu.setBackAction(back);
		return menu;
	}

}
