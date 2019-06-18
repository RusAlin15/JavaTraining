package com.project.game.actions.menu.player_actions;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;
import com.project.game.model.Army;
import com.project.game.model.ArmyType;
import com.project.game.model.Player;

public class ViewArmy extends MenuItem {

	public ViewArmy(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Player selectedPlayer = ApplicationSession.getInstance().getSelectedPlayer();
		Army army = selectedPlayer.getArmyByType(ArmyType.INFANTRY);

		System.out.println(army);
	}

}
