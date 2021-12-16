package model;

import java.io.Serializable;

public class Log implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timee time;
	private Food food;
	private double wheight;
	private double totalCalories;

	public Log(Timee timee, Food food, double wheight) {
		super();
		this.time = timee;
		this.food = food;
		this.wheight = wheight;
		this.totalCalories = wheight * food.getCaloriesPerUnit();
	}

	@Override
	public String toString() {
		return "Hour : " + time + ", Food : " + food + ", Wheight : " + wheight + food.getUnit().toString()
				+ " , Calories : " + totalCalories + " kCa" + "]" + System.lineSeparator();
	}

	public double getTotalCalories() {
		return totalCalories;
	}

}
