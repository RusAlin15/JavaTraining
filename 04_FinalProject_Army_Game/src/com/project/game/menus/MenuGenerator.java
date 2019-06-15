package com.project.game.menus;


public abstract  class MenuGenerator extends Menu{

	public MenuGenerator(String option, String key) {
		super(option, key);
	}

	public abstract void generateMenu();
	
}
