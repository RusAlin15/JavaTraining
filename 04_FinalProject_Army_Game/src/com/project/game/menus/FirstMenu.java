package com.project.game.menus;

import com.project.game.actions.AddPlayerAction;
import com.project.game.actions.RemovePlayerAction;
import com.project.game.actions.ViewPlayersAction;

public class FirstMenu extends Menu {
	
	public FirstMenu(String key, String option) {
		super(key, option);
		createMenu();
	}	
	
	public void createMenu() {
		
		MenuItem selectPlayer = new AddPlayerAction("4", "Select Player");
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
