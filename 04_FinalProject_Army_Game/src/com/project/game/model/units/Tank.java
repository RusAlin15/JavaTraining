package com.project.game.model.units;

import com.project.game.model.ArmyType;

public class Tank  extends Infantry{

	
	public Tank() {
		super(ArmyType.INFANTRY, 10, 100);
	
	}

	@Override
	public ArmyType getType() {
		return ArmyType.INFANTRY ;
	}

}
