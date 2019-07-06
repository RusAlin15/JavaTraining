package com.project.game.model;

import java.io.Serializable;

public abstract class Unit implements Serializable {
	private static final long serialVersionUID = 1L;
	private UnitType type;
	private boolean alive;
	protected double firePower;
	protected double health;

	public Unit(UnitType type) {
		super();
		this.type = type;
	}

	public abstract void setFirePower();

	public abstract void setHealth();

	public void setHealth(double health) {
		this.health = health;
	}

	public double getFirePower() {
		return firePower;
	}

	public void setFirePower(double firePower) {
		this.firePower = firePower;
	}

	public double getHealth() {
		return health;
	}

	public UnitType getType() {
		return type;
	}

	public void kill() {
		alive = false;
	}

	public boolean isAlive() {
		return alive;
	}
}
