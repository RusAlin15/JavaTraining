package com.project.game.actions;

import com.project.game.menus.Menu;

public abstract class GenerateMenuAction extends Menu {

	public GenerateMenuAction(String option, String key) {
		super(option, key);
	}
	
	public abstract void generateMenu();
}
