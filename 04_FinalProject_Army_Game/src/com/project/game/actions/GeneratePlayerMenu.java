package com.project.game.actions;

import com.project.game.menus.BackMenu;
import com.project.game.menus.MenuItem;

public class GeneratePlayerMenu extends CreateMenuAction{

	public GeneratePlayerMenu(String option, String key) {
		super(option, key);
	}

	@Override
	public void generateMenu() {
		MenuItem viewStatistics = new ViewPlayerStatistics("9", "View Statistics");
		MenuItem viewArmy = new ViewArmyAction("8", "View Player Army");
		MenuItem addUnit = new AddUnitAction("7", "Add Unit");
		MenuItem removeUnit = new RemoveUnitAction("6", "Remove Unit");
		MenuItem healUnits = new HealUnitsAction("5", "Heal Units");
		MenuItem attackPlayer = new AttackPlayerAction("4", "Attack Player");
		
		BackMenu back = new BackMenu("0", "Back");
		
		this.addMenuItem(viewStatistics);
		this.addMenuItem(viewArmy);
		this.addMenuItem(addUnit);
		this.addMenuItem(removeUnit);
		this.addMenuItem(healUnits);
		this.addMenuItem(attackPlayer);
		this.addMenuItem(back);
		this.setBackActiom(back);
	}

}
