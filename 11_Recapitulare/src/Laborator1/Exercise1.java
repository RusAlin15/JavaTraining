package Laborator1;

public class Exercise1 {
	public static void main(String[] args) {
		Polygon poligon = new Polygon(6);
		poligon.setSides();
		poligon.calculatePrametru();

		Rectangle rectangle = new Rectangle();
		rectangle.setSides();
		rectangle.calculatePrametru();

		System.out.println(poligon);
		System.out.println(rectangle);
		rectangle.calculateArea();
		System.out.println("Rectangel area : " + rectangle.getArea());

	}
}
