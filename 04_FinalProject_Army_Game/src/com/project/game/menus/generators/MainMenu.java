package com.project.game.menus.generators;

import com.project.game.actions.menuActions.AddPlayerAction;
import com.project.game.actions.menuActions.RemovePlayerAction;
import com.project.game.actions.menuActions.SelectPlayerAction;
import com.project.game.actions.menuActions.ViewPlayersAction;
import com.project.game.menus.BackMenu;
import com.project.game.menus.Menu;
import com.project.game.menus.MenuGenerator;
import com.project.game.menus.MenuItem;

public class MainMenu extends MenuGenerator {

	@Override
	public Menu generateMenu() {
		Menu menu = new Menu("", "");

		MenuItem viewPlayers = new ViewPlayersAction("9", "View Players");
		MenuItem selectPlayer = new SelectPlayerAction("8", "Select Player");
		MenuItem addPlayer = new AddPlayerAction("7", "Add Player");
		MenuItem removePlayer = new RemovePlayerAction("6", "Remove Player");
		BackMenu back = new BackMenu("0", "Exit");

		menu.addMenuItem(viewPlayers);
		menu.addMenuItem(selectPlayer);
		menu.addMenuItem(addPlayer);
		menu.addMenuItem(removePlayer);
		menu.addMenuItem(back);
		menu.setBackAction(back);

		return menu;
	}

}
