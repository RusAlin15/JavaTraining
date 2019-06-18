package com.project.game.model;

public abstract class Unit {
	private String name;
	private ArmyType type;
	private double firePower;
	private  double health;
	
	public abstract ArmyType getType();
	
	public Unit(String name, ArmyType type, double firePower, double health) {
		super();
		this.name = name;
		this.type = type;
		this.firePower = firePower;
		this.health = health;
	}

	@Override
	public String toString() {
		return "Unit [name=" + name + ", type=" + type + ", firePower=" + firePower + ", health=" + health + "]";
	}
	
}
