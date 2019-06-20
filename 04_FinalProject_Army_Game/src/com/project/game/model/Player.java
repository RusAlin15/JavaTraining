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

	@Override
	public String toString() {
		return "Player [name=" + name + ", army=" + army + "]";
	}
	
	

	public String getName() {
		return name;
	}

	public Army getArmyByType(UnitType type) {
		if (!army.containsKey(type)) {
			army.put(type, new Army());
		}
		return army.get(type);
	}
	
	public void resetunits() {
		army.clear();
	}

}
