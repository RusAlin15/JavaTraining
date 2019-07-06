package com.project.game.actions;

import com.project.game.model.Army;
import com.project.game.model.Unit;

public class BattleSimulator {
	Army army1;
	Army army2;

	public BattleSimulator(Army army1, Army army2) {
		this.army1 = army1;
		this.army2 = army2;
	}

	public void battle() {

		for (Unit unit1 : army1.getUnits()) {
			for (Unit unit2 : army2.getUnits()) {
				// unit1.simulateLife(unit2);
			}

		}
	}

}
