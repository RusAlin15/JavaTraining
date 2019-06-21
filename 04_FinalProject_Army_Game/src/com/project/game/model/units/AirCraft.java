package com.project.game.model.units;

import com.project.game.model.Unit;
import com.project.game.model.UnitType;

public class AirCraft extends Unit {
	private static final long serialVersionUID = 1L;
	private int bombs;
	private int missiles;
	private int pilotExp;
	private boolean superSonicSpeed;
	private boolean antiRadar;

	public AirCraft() {
		super(UnitType.AIR_FORCE);
	}

	public void setSuperSonicSpeed() {
		this.superSonicSpeed = Math.random() > 0.5;
	}

	public void setAntiRadar() {
		this.antiRadar = Math.random() > 0.5;
	}

	public void setBombs() {
		this.bombs = (int) (Math.random() * (150 - 80)) + 1;
	}

	public void setMissiles() {
		this.missiles = (int) (Math.random() * (200 - 120)) + 1;
	}

	public void setPilotExp(int pilotExp) {
		this.pilotExp = (int) (Math.random() * (10 - 1)) + 1;
	}

	@Override
	public double getFirePower() {
		return pilotExp * (100 + bombs + missiles);
	}

	@Override
	public double getHealth() {
		return 200 * pilotExp * (superSonicSpeed ? 2 : 1) * (antiRadar ? 2 : 1);
	}

}
