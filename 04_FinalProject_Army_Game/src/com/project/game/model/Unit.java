package com.project.game.model;

import java.io.Serializable;

public abstract class Unit implements Serializable {
	private UnitType type;
	private double firePower;
	private double health;

	public abstract UnitType getType();

	public Unit(UnitType type, double firePower, double health) {
		super();
		this.type = type;
		this.firePower = firePower;
		this.health = health;
	}

	@Override
	public String toString() {
		return "Unit [type=" + type + ", firePower=" + firePower + ", health=" + health + "]";
	}

}
