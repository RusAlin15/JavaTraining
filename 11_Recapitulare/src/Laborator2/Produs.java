package Laborator2;

public class Produs {
	private String name;
	private double price;
	private int cuantity;

	public Produs(String name, double price, int cuantity) {
		super();
		this.name = name;
		this.price = price;
		this.cuantity = cuantity;
	}

	@Override
	public String toString() {
		return "[ " + name + " ] , Price : [ " + price + " ] , Cuantity : [ " + cuantity + " ]";
	}

}
