package com.project.game.model;

import java.io.Serializable;
import java.util.HashMap;

public class Player implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	HashMap<UnitType, Army> army = new HashMap<>();

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Army getArmyByType(UnitType type) {
		return army.get(type);
	}

	public void resetunits() {
		army.clear();
	}

	public void addArmy(UnitType unitType) {
		army.put(unitType, new Army());
	}

	private int getFirePower() {
		int firePower = 0;
		for (UnitType type : UnitType.values()) {
			firePower += army.get(type).getFirePower();
		}
		return firePower;
	}

	private int getHealth() {
		int health = 0;
		for (UnitType type : UnitType.values()) {
			health += army.get(type).getHealth();
		}
		return health;
	}

	@Override
	public String toString() {
		return " Players: " + name + ", firePower: " + this.getFirePower() + ", health: " + this.getHealth()
				+ System.lineSeparator();
	}
}
