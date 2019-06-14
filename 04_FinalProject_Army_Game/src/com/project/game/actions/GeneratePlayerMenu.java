package com.project.game.actions;

import com.project.game.menus.BackMenu;
import com.project.game.menus.MenuItem;

public class GeneratePlayerMenu extends GenerateMenuAction{

	public GeneratePlayerMenu(String option, String key) {
		super(option, key);
	}

	@Override
	public void generateMenu() {
		MenuItem selectPlayer = new AddPlayerAction("4", "Add Unit");
		MenuItem addPlayer = new AddPlayerAction("3", "Remove Unit");
		MenuItem removePlayer = new RemovePlayerAction("2", "Attack Player");
		MenuItem viewPlayers = new ViewPlayersAction("1", "View Army");
		BackMenu back = new BackMenu("0", "Back");
		
		this.addMenuItem(selectPlayer);
		this.addMenuItem(addPlayer);
		this.addMenuItem(removePlayer);
		this.addMenuItem(viewPlayers);
		this.addMenuItem(back);
		this.setBackActiom(back);
	}

}
