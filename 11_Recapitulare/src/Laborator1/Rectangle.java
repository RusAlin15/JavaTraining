package Laborator1;

public class Rectangle extends Polygon {

	private double area;

	public Rectangle() {
		super(4);
		name = "Rectangel";
	}

	@Override
	public void setSides() {
		sides[0] = sides[2] = Double.parseDouble(Keyboard.getMessage("Set " + name + " length"));
		sides[1] = sides[3] = Double.parseDouble(Keyboard.getMessage("Set " + name + " width"));

	}

	public void calculateArea() {
		area = sides[0] * sides[1];
	}

	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return name + " : [area = " + area + "] " + " [perimetru=" + getPerimetru() + "]";
	}

}
