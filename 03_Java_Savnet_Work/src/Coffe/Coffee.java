package Coffe;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
	private List<Ingredient> ingredients = new ArrayList<>();

	public Coffee(List<Ingredient> ingredients) {
		super();
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Coffee ingredients: " + ingredients;
	}

}
