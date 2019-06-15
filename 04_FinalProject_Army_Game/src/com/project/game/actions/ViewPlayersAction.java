package com.project.game.actions;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;

public class ViewPlayersAction extends MenuItem {

	public ViewPlayersAction(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		System.out.println(ApplicationSession.getInstance().getDatabase().getPlayers().toString());
	}

}
