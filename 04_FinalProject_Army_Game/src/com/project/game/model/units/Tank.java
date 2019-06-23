package com.project.game.model.units;

import com.project.game.app.ApplicationSession;
import com.project.game.model.Unit;
import com.project.game.model.UnitType;

public class Tank extends Unit {
	private static final long serialVersionUID = 1L;
	private int missile;
	private int antiMissile;

	public Tank() {
		super(UnitType.INFANTRY);
		setMissile();
		setAntiMissile();
	}

	public void setMissile() {
		this.missile = (int) (Math.random() * (50 - 20)) + 1;
	}

	public void setAntiMissile() {
		this.antiMissile = (int) (Math.random() * (50 - 20)) + 1;
	}

	@Override
	public double getFirePower() {
		General gen = ApplicationSession.getInstance().getSelectedPlayer().getArmyByType(UnitType.INFANTRY)
				.getGeneral();

		return gen.applyBonus(10 + 2 * missile);
	}

	@Override
	public double getHealth() {
		return 10 + antiMissile;
	}

	@Override
	public String toString() {
		return "Tank { Fire Power " + getFirePower() + " ; Health " + getHealth() + "}";
	}

}
