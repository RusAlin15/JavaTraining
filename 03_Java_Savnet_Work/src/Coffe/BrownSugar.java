package Coffe;

public class BrownSugar extends Ingredient {

	public BrownSugar(int quantity) {
		super(quantity);
	}

	@Override
	public String toString() {
		return "BrownSugar [ " + quantity + " ]";
	}
}
