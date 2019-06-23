package com.project.game.model.units;

import com.project.game.app.ApplicationSession;
import com.project.game.model.Unit;
import com.project.game.model.UnitType;

public class Soldier extends Unit {

	private static final long serialVersionUID = 1L;

	private int grenades;
	private int shield;

	public Soldier() {
		super(UnitType.INFANTRY);
		setGrenades();
		setShield();
	}

	public void setGrenades() {
		this.grenades = (int) (Math.random() * (10 - 1)) + 1;
	}

	public void setShield() {
		this.shield = (int) (Math.random() * (10 - 1)) + 1;
	}

	@Override
	public double getFirePower() {
		General gen = ApplicationSession.getInstance().getSelectedPlayer().getArmyByType(UnitType.INFANTRY)
				.getGeneral();
		return gen.applyBonus(1 + 1.5 * grenades);
	}

	@Override
	public double getHealth() {
		return 10 + shield;
	}

	@Override
	public String toString() {
		return "Soldier { Fire Power " + getFirePower() + " ; Health " + getHealth() + "}";
	}

}
