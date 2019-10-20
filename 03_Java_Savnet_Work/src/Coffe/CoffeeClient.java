package Coffe;

import java.util.ArrayList;
import java.util.List;

public class CoffeeClient {

	public static void main(String[] args) {

		List<Ingredient> ingredients = new ArrayList<>();
		ingredients.add(new WhiteSugar(1));
		ingredients.add(new BrownSugar(2));
		ingredients.add(new Milk(2));

		Coffee coffee = new Coffee(ingredients);
		System.out.println(coffee);
	}

}
