package com.project.game.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Army implements Serializable {

	private static final long serialVersionUID = 1L;
	private int numberOfUnits;
	private List<Unit> units = new ArrayList<>();
	private double firePower;
	private double health;

	public Army() {
		super();
	}

	public void addUint(Unit unit) {
		units.add(unit);
		numberOfUnits++;
	}

	@Override
	public String toString() {
		return "Army: " + ", numberOfUnits = " + numberOfUnits + ", firePower=" + firePower + ", health=" + health
				+ "]";
	}

}
