package com.project.game.actions.menu.unitactions;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;
import com.project.game.model.Database;
import com.project.game.model.Player;
import com.project.game.model.units.AirCraft;
import com.project.game.model.units.Tank;

public class AddAirCraft extends MenuItem {

	public AddAirCraft(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Player selectedPlayer = ApplicationSession.getInstance().getSelectedPlayer();
		Database db = ApplicationSession.getInstance().getDatabase();
		
		AirCraft unit = new AirCraft();
		
		db.addUnit(selectedPlayer, unit);
		System.out.println("AirCraft added successfully");
	}

}
