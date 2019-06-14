package com.project.game.menus;

import com.project.game.actions.AddPlayerAction;
import com.project.game.actions.RemovePlayerAction;
import com.project.game.actions.ViewPlayersAction;

public class FirstMenu extends MenuItem {
	
	
	public FirstMenu(String key, String option) {
		super("", "");
	}	
	
	@Override
	public void doAction() {
		Menu players = new Menu("3","Players");
		
		MenuItem addPlayer = new AddPlayerAction("1", "Add Player");
		MenuItem removePlayer = new RemovePlayerAction("2", "Remove Player");
		MenuItem viewPlayers = new ViewPlayersAction("3", "View Players");
		BackMenu back = new BackMenu("0", "Back");
		
		players.addMenuItem(addPlayer);
		players.addMenuItem(removePlayer);
		players.addMenuItem(viewPlayers);
		players.addMenuItem(back);
		
	}
		
}
