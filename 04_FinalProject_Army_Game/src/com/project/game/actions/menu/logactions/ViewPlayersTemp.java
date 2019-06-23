package com.project.game.actions.menu.logactions;

import java.util.List;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;
import com.project.game.model.Player;

public class ViewPlayersTemp extends MenuItem {

	public ViewPlayersTemp(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		List<Player> players = ApplicationSession.getInstance().getDatabase().getPlayers();
		System.out.println();
		for (Player player : players) {
			System.out.print(player.toString());
		}
		System.out.println();
	}

}
