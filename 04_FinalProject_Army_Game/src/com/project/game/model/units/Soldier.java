package com.project.game.model.units;

import com.project.game.model.ArmyType;
import com.project.game.model.InfantryForce;

public class Soldier  extends InfantryForce{

	
	public Soldier() {
		super(ArmyType.INFANTRY, 1, 10);
	
	}

	@Override
	public ArmyType getType() {
		return ArmyType.INFANTRY ;
	}

}
