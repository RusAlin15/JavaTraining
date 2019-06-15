package com.project.game.model;

public abstract class Unit {
	private String name;
	private ArmyType type;
	
	public Unit(String name, ArmyType type) {
		super();
		this.name = name;
		this.type = type;
	}
}
