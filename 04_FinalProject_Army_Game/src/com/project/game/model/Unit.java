package com.project.game.model;

import java.io.Serializable;

public abstract class Unit implements Serializable {
	private ArmyType type;
	private double firePower;
	private double health;

	public abstract ArmyType getType();

	public Unit(ArmyType type, double firePower, double health) {
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
