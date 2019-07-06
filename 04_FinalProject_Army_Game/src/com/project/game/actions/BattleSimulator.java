package com.project.game.actions;

import com.project.game.model.Army;
import com.project.game.model.Unit;
import com.project.game.model.units.General;

public class BattleSimulator {
	Army attackerArmy;
	Army enemyArmy;
	General attackerGeneral;
	General enemyGeneral;

	public BattleSimulator(Army attackerArmy, Army enemyArmy) {
		this.attackerArmy = attackerArmy;
		this.enemyArmy = enemyArmy;
		this.attackerGeneral = attackerArmy.getGeneral();
		this.enemyGeneral = enemyArmy.getGeneral();
	}

	public void battle() {

		for (Unit attacker : attackerArmy.getUnits()) {
			for (Unit enemy : enemyArmy.getUnits()) {
				if (attacker.isAlive() && enemy.isAlive()) {
					simulateBattle(attacker, enemy);
				}
			}
		}

		attackerArmy.recalculateAttributes();
		enemyArmy.recalculateAttributes();

		if (attackerArmy.getHealth() != 0) {
			attackerGeneral.increseBonus();
		}
		if (enemyArmy.getHealth() != 0) {
			enemyGeneral.increseBonus();
		}
	}

	private void simulateBattle(Unit attacker, Unit enemy) {
		while (true) {
			boolean flag = false;
			double attackerHP = attacker.getHealth();
			double enemyHP = enemy.getHealth();

			double attackerForce = attacker.getFirePower() + attackerGeneral.getBonus();
			double enemyForce = enemy.getFirePower() + enemyGeneral.getBonus();

			attacker.setHealth(attackerHP - enemyForce);
			enemy.setHealth(enemyHP - attackerForce);

			if (isKilled(attacker)) {
				attacker.kill();
				flag = true;
			}
			if (isKilled(enemy)) {
				enemy.kill();
				flag = true;
			}
			if (flag) {
				break;
			}
		}
	}

	private boolean isKilled(Unit attacker) {
		return attacker.getHealth() < 0;
	}

}
