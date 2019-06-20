package com.project.game.model;

import com.project.game.model.ArmyType;
import com.project.game.model.Unit;

public abstract class InfantryForce extends Unit {
	
	public InfantryForce(ArmyType type, double firePower, double health) {
		super(type, firePower, health);
	}
}
