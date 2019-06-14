package com.project.game.menus;

public abstract class MenuItem {
	private String key;
	private String option;
	
	public MenuItem(String key, String option) {
		super();
		this.key = key;
		this.option = option;
	}

	@Override
	public String toString() {
		return option + ". " + key;
	}
	
	public abstract void doAction();

	public String getOption() {
		return option;
	}

}
