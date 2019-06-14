package com.project.game.actions;

import com.project.game.menus.Menu;

public abstract class CreateMenuAction extends Menu {

	public CreateMenuAction(String option, String key) {
		super(option, key);
	}
	
	public abstract void generateMenu();
}
