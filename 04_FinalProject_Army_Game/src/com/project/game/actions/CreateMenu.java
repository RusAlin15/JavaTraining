package com.project.game.actions;

import com.project.game.menus.Menu;

public abstract class CreateMenu extends Menu {

	public CreateMenu(String option, String key) {
		super(option, key);
	}
	
	public abstract void generateMenu();
}
