package com.project.game.menus.generators;

import com.project.game.actions.menu.unit_actions.AddAirCraft;
import com.project.game.actions.menu.unit_actions.AddHelicopter;
import com.project.game.actions.menu.unit_actions.AddSoldier;
import com.project.game.actions.menu.unit_actions.AddTank;
import com.project.game.menus.BackMenu;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuGenerator;
import com.project.game.menus.MenuItem;

public class UnitsMenu extends MenuGenerator {

	@Override
	public Menu generateMenu() {
		Menu menu = new Menu("","");
		
		MenuItem addSoldier = new AddSoldier ("1", "Soldier");
		MenuItem addTank = new AddTank ("2", "Tank");
		MenuItem addHelicopter = new AddHelicopter("3", "Helicopter");
		MenuItem addAirCraft = new AddAirCraft("4", "AirCraft");
		BackMenu back = new BackMenu("0", "Back");
		  
		menu.addMenuItem(addSoldier);
		menu.addMenuItem(addTank);
		menu.addMenuItem(addHelicopter);
		menu.addMenuItem(back);
		menu.setBackAction(back);		
		
		return menu;
	}
}
