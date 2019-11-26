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
		return name + " " + caloriesPerUnit + " kCa/" + unit.toString();
	}

	public Object getName() {
		return name;
	}

	public double getCaloriesPerUnit() {
		return caloriesPerUnit;
	}

	public Unit getUnit() {
		return unit;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (unit != other.unit)
			return false;
		return true;
	}

}
