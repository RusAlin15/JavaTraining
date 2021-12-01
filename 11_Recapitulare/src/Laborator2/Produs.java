package Laborator2;

public class Produs {
	private String name;
	private double price;
	private int quantity;

	public Produs(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return name + " - " + quantity + " pcs  at " + price + " $ each";
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}
