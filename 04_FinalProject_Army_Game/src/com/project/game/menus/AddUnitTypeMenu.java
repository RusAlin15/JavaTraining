package com.project.game.menus;

import com.project.game.actions.AddArmyUnitsAction;
import com.project.game.actions.AddUnitAction;
import com.project.game.actions.RemoveArmyUnitsAction;
import com.project.game.actions.SelectArmyUnitsAction;
import com.project.game.actions.ViewArmyUnitsAction;
import com.project.game.model.ArmyType;

public class AddUnitTypeMenu extends Menu {
	
	public AddUnitTypeMenu(String option, String key) {
		super(option, key);
		
		MenuItem viewArmy = new AddUnitAction ("9", "Soldier");
		BackMenu back = new BackMenu("0", "Back");
		  
		this.addMenuItem(viewArmy);
		this.addMenuItem(back);
		this.setBackAction(back);
	}

}
