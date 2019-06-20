package com.project.game.actions.menu.logactions;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;

public class ViewPlayersTemp extends MenuItem {

	public ViewPlayersTemp(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		System.out.println(ApplicationSession.getInstance().getDatabase().getPlayers().toString());
	}

}
