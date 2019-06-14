package com.project.game.actions;

import com.project.game.menus.BackMenu;
import com.project.game.menus.MenuItem;

public class GenerateMainMenu extends GenerateMenuAction {
	
	public GenerateMainMenu(String key, String option) {
		super(key, option);
	}	

	@Override
	public void generateMenu() {
		MenuItem selectPlayer = new SelectPlayerAction("4", "Select Player");
		MenuItem addPlayer = new AddPlayerAction("3", "Add Player");
		MenuItem removePlayer = new RemovePlayerAction("2", "Remove Player");
		MenuItem viewPlayers = new ViewPlayersAction("1", "View Players");
		BackMenu back = new BackMenu("0", "Back");
		
		this.addMenuItem(selectPlayer);
		this.addMenuItem(addPlayer);
		this.addMenuItem(removePlayer);
		this.addMenuItem(viewPlayers);
		this.addMenuItem(back);
		this.setBackActiom(back);
	}
}
