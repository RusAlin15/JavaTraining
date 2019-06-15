package com.project.game.app;

import com.project.game.actions.CreateMenuAction;
import com.project.game.actions.GenerateMainMenu;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		app.run();

	}

	private void run() {
		CreateMenuAction firstMenu  = new GenerateMainMenu("", "");
		firstMenu.generateMenu();
		firstMenu.doAction();
	}
}
