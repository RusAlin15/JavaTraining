package Laborator1;

public class Polygon {
	protected double[] sides;
	private double perimetru = 0;
	protected String name;

	public Polygon(int sidesNr) {
		sides = new double[sidesNr];
		this.name = "Polygon";
	}

	public void setSides() {
		for (int d = 0; d < sides.length; d++) {
			sides[d] = Double.parseDouble(Keyboard.getMessage("Introduceti lungimea unei laturi pentru " + name));
		}
	}

	public double calculatePrametru() {
		for (double d : sides) {
			perimetru += d;
		}
		return perimetru;
	}

	@Override
	public String toString() {
		return name + "are perimetrul : " + perimetru;
	}

}
