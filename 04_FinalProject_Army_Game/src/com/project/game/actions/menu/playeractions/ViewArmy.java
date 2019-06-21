package com.project.game.actions.menu.playeractions;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;
import com.project.game.model.Army;
import com.project.game.model.Player;
import com.project.game.model.UnitType;

public class ViewArmy extends MenuItem {

	public ViewArmy(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Player selectedPlayer = ApplicationSession.getInstance().getSelectedPlayer();
		Army army = selectedPlayer.getArmyByType(UnitType.INFANTRY);
		Army army2 = selectedPlayer.getArmyByType(UnitType.AIR_FORCE);
		Army army3 = selectedPlayer.getArmyByType(UnitType.MARINE_FORCE);

//		System.out.println(army);
//		System.out.println(army2);
//		System.out.println(army3);
		System.out.println(selectedPlayer);
	}

}
