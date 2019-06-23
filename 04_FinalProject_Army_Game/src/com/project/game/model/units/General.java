package com.project.game.model.units;

import java.io.Serializable;

public class General implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private double bonus;

	public General(String name) {
		super();
		this.name = name;
		this.bonus = 0;
	}

	public String getName() {
		return name;
	}

	public double getBonus() {
		return bonus;
	}

}
