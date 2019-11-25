package app;

import actions.AddFoodItem;
import actions.DeleteFoodItem;
import actions.ViewFoodItem;
import menu.BackMenu;
import menu.Menu;
import menu.MenuItem;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		ApplicationSession.getInstance().init();
		app.run();
	}

	private void run() {
		Menu mainMenu = new Menu("", "");
		Menu foodMenu = new Menu("1", "Food Management");
		Menu foodLogMenu = new Menu("2", "Food Log");
		MenuItem backItem = new BackMenu("0", "Back");

		MenuItem addFood = new AddFoodItem("3", "Add Food");
		MenuItem viewItem = new ViewFoodItem("2", "View Food");
		MenuItem deleteFood = new DeleteFoodItem("1", "Add Food");

		foodMenu.addItem(addFood);
		foodMenu.addItem(viewItem);
		foodMenu.addItem(deleteFood);
		foodMenu.setBackAction(backItem);
		foodMenu.addItem(backItem);

		foodLogMenu.setBackAction(backItem);
		foodLogMenu.addItem(backItem);

		mainMenu.addItem(foodMenu);
		mainMenu.addItem(foodLogMenu);
		mainMenu.setBackAction(backItem);
		mainMenu.addItem(backItem);

		mainMenu.doAction();
	}
}
