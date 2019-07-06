package com.project.game.model.units;

import com.project.game.model.Unit;
import com.project.game.model.UnitType;

public class Plane extends Unit {
	private static final long serialVersionUID = 1L;
	private int bombs;
	private int missiles;
	private int pilotExp;
	private boolean superSonicSpeed;
	private boolean antiRadar;

	public Plane() {
		super(UnitType.AIR_FORCE);
		setAntiRadar();
		setBombs();
		setMissiles();
		setPilotExp();
		setSuperSonicSpeed();
	}

	public void setSuperSonicSpeed() {
		this.superSonicSpeed = Math.random() > 0.5;
	}

	public void setAntiRadar() {
		this.antiRadar = Math.random() > 0.5;
	}

	public void setBombs() {
		this.bombs = (int) (Math.random() * (60 - 30)) + 1;
	}

	public void setMissiles() {
		this.missiles = (int) (Math.random() * (50 - 12)) + 1;
	}

	public void setPilotExp() {
		this.pilotExp = (int) (Math.random() * (10 - 1)) + 1;
	}

	@Override
	public void setFirePower() {
		firePower = (pilotExp * (100 + bombs + missiles));
	}

	@Override
	public void setHealth() {
		health = 75 * pilotExp * (superSonicSpeed ? 2 : 1) * (antiRadar ? 2 : 1);
	}

	@Override
	public String toString() {
		return "Plane { Fire Power " + firePower + " ; Health " + health + "}";
	}
}
