package Coffe;

public class WhiteSugar extends Ingredient {

	public WhiteSugar(int quantity) {
		super(quantity);
	}

	@Override
	public String toString() {
		return "WhiteSugar [ " + quantity + " ]";
	}

}
