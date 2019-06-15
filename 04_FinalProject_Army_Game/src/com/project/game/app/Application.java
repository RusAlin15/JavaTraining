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
		mainMenu.createMainMenu();
		mainMenu.doAction();
	}
}
