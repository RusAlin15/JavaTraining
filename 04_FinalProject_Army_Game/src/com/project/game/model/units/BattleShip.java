package com.project.game.model.units;

import com.project.game.model.Unit;
import com.project.game.model.UnitType;

public class BattleShip extends Unit {
	private static final long serialVersionUID = 1L;
	private int bombs;
	private int missiles;
	private int pilotExp;

	public BattleShip() {
		super(UnitType.MARINE_FORCE);
		setBombs();
		setMissiles();
		setPilotExp();
	}

	public void setBombs() {
		this.bombs = (int) (Math.random() * (100 - 30)) + 1;
	}

	public void setMissiles() {
		this.missiles = (int) (Math.random() * (60 - 30)) + 1;
	}

	public void setPilotExp() {
		this.pilotExp = (int) (Math.random() * (10 - 1)) + 1;
	}

	@Override
	public double getFirePower() {
		return pilotExp * (100 + bombs + missiles);
	}

	@Override
	public double getHealth() {
		return 85 * pilotExp;
	}

	@Override
	public String toString() {
		return "BattleShip { Fire Power " + getFirePower() + " ; Health " + getHealth() + "}";
	}
}
