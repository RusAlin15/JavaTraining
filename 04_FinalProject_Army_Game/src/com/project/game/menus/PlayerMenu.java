package com.project.game.menus;

import com.project.game.actions.AddArmyUnitsAction;
import com.project.game.actions.AttackArmyUnitsAction;
import com.project.game.actions.RemoveArmyUnitsAction;
import com.project.game.actions.SelectArmyUnitsAction;
import com.project.game.actions.ViewArmyUnitsAction;

public class PlayerMenu extends Menu {

	public PlayerMenu(String option, String key) {
		super(option, key);
		
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
