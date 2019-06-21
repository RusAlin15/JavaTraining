package com.project.game.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Army implements Serializable {

	private static final long serialVersionUID = 1L;
	private int numberOfUnits;
	private List<Unit> units = new ArrayList<>();
	private int firePower;
	private int health;

	public Army() {
		super();
	}

	public void addUint(Unit unit) {
		units.add(unit);
		firePower += unit.getFirePower();
		health += unit.getHealth();
		numberOfUnits++;
	}

	public double getFirePower() {
		return firePower;
	}

	public double getHealth() {
		return health;
	}

	@Override
	public String toString() {
		return "Army: " + units.get(0).getType() + ", numberOfUnits = " + numberOfUnits + ", firePower=" + firePower
				+ ", health=" + health + "]";
	}

}
