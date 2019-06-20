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
		for(UnitType unit : UnitType.values()) {
			army.put(unit, new Army());
		}
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", army=" + army.get(UnitType.INFANTRY) + "]" + System.lineSeparator() //
				+ "+ army=" + army.get(UnitType.AIR_FORCE) + "]" + System.lineSeparator() //
				+ "+ army=" + army.get(UnitType.MARINE_FORCE) + "]" + System.lineSeparator();
				
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

}
