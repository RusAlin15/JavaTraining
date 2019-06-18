package com.project.game.model.units;

import com.project.game.model.ArmyType;
import com.project.game.model.Unit;

public abstract class Infantry extends Unit {
	
	public Infantry(ArmyType type, double firePower, double health) {
		super(type, firePower, health);
	}
	
}
