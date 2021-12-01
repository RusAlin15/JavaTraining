package Laborator2;

public class Parabola {
	private double a, b, c;
	private Punct varfParabola;

	public Parabola(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Parabola(Parabola p) {
		this.a = p.a;
		this.b = p.b;
		this.c = p.c;

	}

	public void calculVarf() {
		double x = -(b / 2 * a);
		double y = -((b * b) + 4 * a * c) / 4 * a;
		varfParabola = new Punct(x, y);
	}

	public static Punct getMijlocCoordonate(Parabola a, Parabola b) {
		double x = (a.getXVarf() + b.getXVarf()) / 2;
		double y = (a.getYVarf() + b.getYVarf()) / 2;

		return new Punct(x, y);
	}

	private double getXVarf() {
		return varfParabola.getX();
	}

	private double getYVarf() {
		return varfParabola.getY();
	}

	@Override
	public String toString() {
		return "f(x) =" + a + "x^2 + " + b + "x + " + c + "\n" + "Parabola are varful in coordonatele : "
				+ varfParabola;
	}

}
