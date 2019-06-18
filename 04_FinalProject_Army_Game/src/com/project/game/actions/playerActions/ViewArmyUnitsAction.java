package com.project.game.actions.playerActions;

import com.project.game.app.ApplicationSession;
import com.project.game.menus.MenuItem;
import com.project.game.model.Army;
import com.project.game.model.ArmyType;
import com.project.game.model.Player;

public class ViewArmyUnitsAction extends MenuItem {

	public ViewArmyUnitsAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Player selectedPlayer = ApplicationSession.getInstance().getSelectedPlayer();
		Army army = selectedPlayer.getArmyByType(ArmyType.Infantry);

		System.out.println(army);
	}

}
