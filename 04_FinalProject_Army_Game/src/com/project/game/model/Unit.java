package com.project.game.model;

import java.io.Serializable;

public abstract class Unit implements Serializable {
	private static final long serialVersionUID = 1L;
	private UnitType type;

	public abstract double getFirePower();

	public abstract double getHealth();

	public UnitType getType() {
		return type;
	}

	public Unit(UnitType type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Unit [type=" + type + "]";
	}

}
