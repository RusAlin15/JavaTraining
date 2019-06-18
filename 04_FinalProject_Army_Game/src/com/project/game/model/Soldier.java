package com.project.game.model;

public class Soldier  extends Infantry{

	
	public Soldier(String name) {
		super(name, ArmyType.Infantry, 1, 10);
	
	}

	@Override
	public ArmyType getType() {
		return ArmyType.Infantry;
	}

}
