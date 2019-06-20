package com.project.game.model.units;

import com.project.game.model.Unit;
import com.project.game.model.UnitType;

public class Soldier  extends Unit{
	
	public Soldier() {
		super(UnitType.INFANTRY, 1, 10);
	}

}
