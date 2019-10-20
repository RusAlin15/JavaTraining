package Coffe;

public class Milk extends Ingredient {

	public Milk(int quantity) {
		super(quantity);
	}

	@Override
	public String toString() {
		return "Milk [ " + quantity + "% ]";
	}
}
