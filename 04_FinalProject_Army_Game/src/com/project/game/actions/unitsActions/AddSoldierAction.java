package com.project.game.actions.unitsActions;

import com.project.game.app.ApplicationSession;
import com.project.game.app.Keyboard;
import com.project.game.menus.MenuItem;
import com.project.game.model.Army;
import com.project.game.model.ArmyType;
import com.project.game.model.Player;
import com.project.game.model.Soldier;

public class AddSoldierAction extends MenuItem {

	public AddSoldierAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeboard();
		Player selectedPlayer = ApplicationSession.getInstance().getSelectedPlayer();
		Army army = selectedPlayer.getArmyByType(ArmyType.Infantry);
		
		String name = keyboard.getMessage("Insert Soldier name.");
		army.addUint(new Soldier(name));
		System.out.println(army);
	}

}
