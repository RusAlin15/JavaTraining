package com.project.game.app;

import com.project.game.menus.MainMenu;
import com.project.game.menus.Menu;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		ApplicationSession.getInstance().init();
		app.run();

	}

	private void run() {
		
		Menu mainMenu = new MainMenu("", "");
		mainMenu.doAction();
	}
}
