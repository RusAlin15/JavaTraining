//
package Laborator2;

public class Exercise1 {
	public static void main(String[] args) {
		Punct p1 = new Punct(10, 20);
		Punct p2 = new Punct(30, 40);

		@SuppressWarnings("unused")
		Punct p3 = new Punct(p1);

		p1.init(10, 20);
		p2.init(30, 40);
		p1.move(8, -2);
		p2.move(6, 7);

		System.out.println("S-au executat " + Punct.getContor() + "mutari.");

		System.out.println("(x1,y1) = (" + p1.getX() + "," + p1.getY() + ")"); // se afiseaza
		// coordonatele curente ale primului punct
		System.out.println("(x2,y2) = (" + p2.getX() + "," + p2.getY() + ")"); // se afiseaza
		// coordonatele curente ale celui de-al 2-lea punct
	}
}
