package com.project.game.actions;

import com.project.game.menus.BackMenu;
import com.project.game.menus.MenuItem;

public class GenerateMainMenu extends CreateMenuAction {
	
	public GenerateMainMenu(String key, String option) {
		super(key, option);
	}	

	@Override
	public void generateMenu() {
		MenuItem viewPlayers = new ViewPlayersAction("9", "View Players");
		MenuItem selectPlayer = new SelectPlayerAction("8", "Select Player");
		MenuItem addPlayer = new AddPlayerAction("7", "Add Player");
		MenuItem removePlayer = new RemovePlayerAction("6", "Remove Player");
		BackMenu back = new BackMenu("0", "Exit");
		
		this.addMenuItem(viewPlayers);
		this.addMenuItem(selectPlayer);
		this.addMenuItem(addPlayer);
		this.addMenuItem(removePlayer);
		this.addMenuItem(back);
		this.setBackActiom(back);
	}
}
