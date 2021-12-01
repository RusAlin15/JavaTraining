package Laborator2;

class Punct {
	private double x;
	private double y;
	private static int contor = 0; // initializator implicit

	public Punct(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punct(Punct p) {
		x = p.x;
		y = p.y;
	}

	public void init(double xx, double yy) {
		x = xx;
		y = yy;
	}

	public void move(double dx, double dy) {
		x += dx;
		y += dy;
		contor++;
	}

	public static int getContor() {
		return contor;
	}

	public double distV(Punct p) {
		return y - p.y;
	}

	public double distH(Punct p) {
		return x - p.x;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punct ( " + x + " , " + y + ")";
	}

}