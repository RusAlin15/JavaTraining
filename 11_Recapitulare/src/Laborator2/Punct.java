package Laborator2;

class Punct {
	private int x;
	private int y;
	private static int contor = 0; // initializator implicit

	public Punct(int xx, int yy) {
		x = xx;
		y = yy;
	}

	public Punct(Punct p) {
		x = p.x;
		y = p.y;
	}

	public void init(int xx, int yy) {
		x = xx;
		y = yy;
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
		contor++;
	}

	public static int getContor() {
		return contor;
	}

	public int distV(Punct p) {
		return y - p.y;
	}

	public int distH(Punct p) {
		return x - p.x;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}