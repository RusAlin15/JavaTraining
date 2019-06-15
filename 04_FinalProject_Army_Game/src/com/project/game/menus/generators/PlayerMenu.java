package com.project.game.menus.generators;

import com.project.game.actions.playerActions.AddArmyUnitsAction;
import com.project.game.actions.playerActions.AttackArmyUnitsAction;
import com.project.game.actions.playerActions.RemoveArmyUnitsAction;
import com.project.game.actions.playerActions.ViewArmyUnitsAction;
import com.project.game.menus.BackMenu;
import com.project.game.menus.MenuGenerator;
import com.project.game.menus.MenuItem;

public class PlayerMenu extends MenuGenerator{

	public PlayerMenu(String option, String key) {
		super(option, key);
	}

	@Override
	public void generateMenu() {
		MenuItem viewArmy = new ViewArmyUnitsAction("9", "View Army Unists");
		MenuItem addArmy = new AddArmyUnitsAction("8", "Add Army Unit");
		MenuItem removeArmy = new RemoveArmyUnitsAction("7", "Remove Army Unit");
		MenuItem attackPlayer = new AttackArmyUnitsAction("6", "Attack Player");
		BackMenu back = new BackMenu("0", "Back");
		  
		this.addMenuItem(viewArmy);
		this.addMenuItem(addArmy);
		this.addMenuItem(removeArmy);
		this.addMenuItem(attackPlayer);
		this.addMenuItem(back);
		this.setBackAction(back);		
	}

}
