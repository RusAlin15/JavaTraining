package com.project.game.actions.unitsActions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.MenuItem;
import com.project.game.model.Army;
import com.project.game.model.ArmyType;
import com.project.game.model.Database;
import com.project.game.model.Player;
import com.project.game.model.Soldier;
import com.project.game.model.Unit;

public class AddSoldierAction extends MenuItem {

	public AddSoldierAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		Player selectedPlayer = ApplicationSession.getInstance().getSelectedPlayer();
		Database db = ApplicationSession.getInstance().getDatabase();
		
		String name = keyboard.getMessage("Insert Soldier name.");
		
		Unit unit = new Soldier(name);
		
		Army army = selectedPlayer.getArmyByType(unit.getType());
		 
		army.addUint(unit);
		
		//ApplicationSession.getInstance().getSerializer().save(db);
	}

}
