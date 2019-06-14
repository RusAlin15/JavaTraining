package com.project.game.app;

import com.project.game.actions.GenerateMainMenu;
import com.project.game.actions.GenerateMenuAction;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		app.run();

	}

	private void run() {
		GenerateMenuAction firstMenu  = new GenerateMainMenu("", "");
		firstMenu.generateMenu();
		firstMenu.doAction();
			

	}
}
