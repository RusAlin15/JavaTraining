package com.project.game.model.units;

import com.project.game.model.AirForce;
import com.project.game.model.ArmyType;

public class Helicopter  extends AirForce{
	
	public Helicopter() {
		super(ArmyType.AIR_FORCE, 1, 10);
	
	}

	@Override
	public ArmyType getType() {
		return ArmyType.AIR_FORCE ;
	}

}
