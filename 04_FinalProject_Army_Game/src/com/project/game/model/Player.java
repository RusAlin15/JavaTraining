package com.project.game.model;

import java.io.Serializable;
import java.util.HashMap;

public class Player implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	HashMap <ArmyType,Army> army = new HashMap<>();
	
	public Player(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public Army getArmyByType(ArmyType type) {
		if(!army.containsValue(type)) {
			army.put(type, new Army());
		}
		return army.get(type);
	}
	
}
