package com.project.game.actions.menu.playeractions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.MenuItem;
import com.project.game.model.Database;
import com.project.game.model.Player;

public class AttackPlayer extends MenuItem {
	private Database db;
	private Player selectedPlayer;

	public AttackPlayer(String option, String key) {
		super(option, key);
		db = ApplicationSession.getInstance().getDatabase();
		selectedPlayer = ApplicationSession.getInstance().getSelectedPlayer();
	}

	@Override
	public void doAction() {

		System.out.println(db);
		try {
			setAttackedPlayer();
		} catch (RuntimeException ex) {
			throw ex;
		}

		Player attackedPlayer = ApplicationSession.getInstance().getAttackedPlayer();
		System.out.println(System.lineSeparator() + attackedPlayer.getName() + " is now your enemy!" //
				+ System.lineSeparator());
	}

	private void setAttackedPlayer() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		String name = keyboard.getMessage("Insert player name you want to attak.");

		try {
			ApplicationSession.getInstance().setAttackedPlayer(name);
		} catch (RuntimeException e) {
			throw e;
		}
	}

}
