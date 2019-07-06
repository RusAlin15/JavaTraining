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

	@Override
	public String toString() {
		return "General " + name + " (" + bonus + "%)" + " added.";
	}

	public int applyBonus(double d) {
		return (int) (d + (d * bonus) / 100);
	}
}
