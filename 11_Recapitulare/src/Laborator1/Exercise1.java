//
package Laborator1;

public class Exercise1 {
	public static void main(String[] args) {
		Polygon poligon = new Polygon(3);
		poligon.setSides();
		poligon.calculatePrametru();

		Rectangle rectangle = new Rectangle();
		rectangle.setSides();
		rectangle.calculatePrametru();
		rectangle.calculateArea();

		System.out.println(poligon);
		System.out.println(rectangle);
		rectangle.calculateArea();

	}
}
