package com.project.game.model.units;

import com.project.game.model.Unit;
import com.project.game.model.UnitType;

public class AirCraft extends Unit{

	public AirCraft() {
		super(UnitType.AIR_FORCE, 10, 20);
	}

	@Override
	public UnitType getType() {
		return UnitType.AIR_FORCE;
	}

}
