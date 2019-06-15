package com.project.game.menus;

import com.project.game.actions.AddPlayerAction;
import com.project.game.actions.RemovePlayerAction;
import com.project.game.actions.SelectPlayerAction;
import com.project.game.actions.ViewPlayersAction;

public class MainMenu extends Menu {

	public MainMenu(String option, String key) {
		super(option, key);
		
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
		this.setBackAction(back);
	}
	
}
