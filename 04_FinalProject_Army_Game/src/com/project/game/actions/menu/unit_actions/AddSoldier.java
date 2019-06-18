package com.project.game.actions.menu.unit_actions;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;
import com.project.game.model.Database;
import com.project.game.model.Player;
import com.project.game.model.units.Helicopter;

public class AddSoldier extends MenuItem {

	public AddSoldier(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Player selectedPlayer = ApplicationSession.getInstance().getSelectedPlayer();
		Database db = ApplicationSession.getInstance().getDatabase();

		Helicopter soldier = new Helicopter();
		
		db.addUnit(selectedPlayer, soldier);
		System.out.println("Soldier added successfully");
	
	}

}
