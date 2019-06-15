package com.project.game.model;

import java.util.*;

public class Army {
	
	private int numberOfUnits;
	private List<Unit> units = new ArrayList<>();
	private double firePower;
	private double health;
	
	public void addUint(Unit unit) {
		units.add(unit);
		numberOfUnits++;
	}
}
