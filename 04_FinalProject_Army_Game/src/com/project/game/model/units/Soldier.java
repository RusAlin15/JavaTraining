package com.project.game.model.units;

import com.project.game.model.ArmyType;

public class Soldier  extends Infantry{

	
	public Soldier() {
		super(ArmyType.INFANTRY, 1, 10);
	
	}

	@Override
	public ArmyType getType() {
		return ArmyType.INFANTRY ;
	}

}
