package model;

import java.io.Serializable;

public class Food implements Serializable {
	private String name;
	private Unit unit;
	private double caloriesPerUnit;

	public Food(String name, Unit unit, double caloriesPerUnit) {
		super();
		this.name = name;
		this.unit = unit;
		this.caloriesPerUnit = caloriesPerUnit;
	}

	@Override
	public String toString() {
		return name + ", unit : " + unit + ", caloriesPerUnit=" + caloriesPerUnit + System.lineSeparator();
	}

}
