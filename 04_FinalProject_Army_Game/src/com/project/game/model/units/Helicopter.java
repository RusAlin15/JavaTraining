package com.project.game.model.units;

import com.project.game.model.Unit;
import com.project.game.model.UnitType;

public class Helicopter extends Unit {
	private static final long serialVersionUID = 1L;
	private int bombs;
	private int rockets;
	private boolean antiRadar;

	public Helicopter() {
		super(UnitType.AIR_FORCE);
		setAntiRadar();
		setBombs();
		setRockets();
	}

	public void setBombs() {
		this.bombs = (int) (Math.random() * (60 - 30)) + 1;
	}

	public void setRockets() {
		this.rockets = (int) (Math.random() * (45 - 25)) + 1;
	}

	public void setAntiRadar() {
		this.antiRadar = Math.random() < 0.5;
	}

	@Override
	public double getFirePower() {
		return 100 + bombs + rockets;
	}

	@Override
	public double getHealth() {
		return 100 + (antiRadar ? 50 : 0);
	}

	@Override
	public String toString() {
		return "Helicopter { Fire Power " + getFirePower() + " ; Health " + getHealth() + "}";
	}
}
