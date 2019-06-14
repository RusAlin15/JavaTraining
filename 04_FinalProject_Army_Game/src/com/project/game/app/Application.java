package com.project.game.app;

import com.project.game.menus.FirstMenu;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		app.run();

	}

	private void run() {
		FirstMenu firstMenu  = new FirstMenu("", "");
		firstMenu.doAction();
	}
}
