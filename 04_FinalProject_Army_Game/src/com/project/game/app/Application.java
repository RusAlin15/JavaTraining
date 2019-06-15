package com.project.game.app;

import com.project.game.menus.MenuGenerator;
import com.project.game.menus.generators.MainMenu;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		ApplicationSession.getInstance().init();
		app.run();
	}
 
	private void run() {
		
		MenuGenerator mainMenu = new  MainMenu("", "");
		mainMenu.generateMenu();
		mainMenu.doAction();
	}
}
