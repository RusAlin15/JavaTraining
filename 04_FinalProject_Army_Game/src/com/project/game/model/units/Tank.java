package com.project.game.model.units;

import com.project.game.model.ArmyType;
import com.project.game.model.InfantryForce;

public class Tank  extends InfantryForce{

	
	public Tank() {
		super(ArmyType.INFANTRY, 10, 100);
	
	}

	@Override
	public ArmyType getType() {
		return ArmyType.INFANTRY ;
	}

}
