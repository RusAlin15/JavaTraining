package com.project.game.app;

import com.project.game.actions.AddPlayerAction;
import com.project.game.actions.RemovePlayerAction;
import com.project.game.actions.SelectPlayerAction;
import com.project.game.actions.ViewPlayersAction;
import com.project.game.menus.BackMenu;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuItem;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		ApplicationSession.getInstance().init();
		app.run();

	}

	private void run() {
		Menu mainMenu = new Menu("", "");	
		
		Menu players = new Menu("3", "Players");
		MenuItem viewPlayers = new ViewPlayersAction("9", "View Players");
		//MenuItem selectPlayer = new SelectPlayerAction("8", "Select Player");
		MenuItem addPlayer = new AddPlayerAction("7", "Add Player");
		MenuItem removePlayer = new RemovePlayerAction("6", "Remove Player");
		BackMenu back = new BackMenu("0", "Exit");
		
		players.addMenuItem(viewPlayers);
		//players.addMenuItem(selectPlayer);
		players.addMenuItem(addPlayer);
		players.addMenuItem(removePlayer);
		players.addMenuItem(back);
		players.setBackAction(back);
		
		mainMenu.addMenuItem(players);
		mainMenu.addMenuItem(back);
		mainMenu.setBackAction(back);
		
		mainMenu.doAction();
	}
}
