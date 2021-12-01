//
package Laborator1;

import inputOotputClasses.Keyboard;

public class Polygon {
	protected double[] sides;
	private double perimetru = 0;
	protected String name;

	public Polygon(int sidesNr) {
		sides = new double[sidesNr];
		this.name = "Polygon";
	}

	public void setSides() {
		for (int d = 0; d < sides.length;) {
			sides[d] = Double
					.parseDouble(Keyboard.getMessage("Introduceti lungimea laturii " + (++d) + " pentru " + name));
		}
	}

	public void calculatePrametru() {
		for (double d : sides) {
			perimetru += d;
		}
	}

	public double getPerimetru() {
		return perimetru;
	}

	@Override
	public String toString() {
		return name + " : [perimetru = " + perimetru + "]";
	}

}
