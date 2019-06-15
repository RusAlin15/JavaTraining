package com.project.game.model;

public class Soldier  extends Infantry{
	private double firePower;
	private  double health;
	
	public Soldier(String name) {
		super(name, ArmyType.Infantry);
	}

	public void setFirePower(double firePower) {
		this.firePower = 1;
	}

	public void setHealth(double health) {
		this.health = 10;
	}

	@Override
	public String toString() {
		return "Soldier [firePower=" + firePower + ", health=" + health + "]";
	}
	
}
