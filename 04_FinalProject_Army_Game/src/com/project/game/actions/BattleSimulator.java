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
				if (unit1.isAlive() && unit2.isAlive()) {
					simulateBattle(unit1, unit2);
				}
			}
		}
	}

	private void simulateBattle(Unit unit1, Unit unit2) {
		double fp1 = unit1.getFirePower();
		double fp2 = unit2.getFirePower();
		double hp1 = unit1.getHealth();
		double hp2 = unit2.getHealth();

	}

}
