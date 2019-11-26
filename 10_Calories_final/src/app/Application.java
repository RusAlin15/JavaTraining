package app;

import actions.AddFoodItem;
import actions.AddLogItem;
import actions.DeleteFoodItem;
import actions.DeleteLog;
import actions.ViewFoodItem;
import actions.ViewLogsItem;
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

		MenuItem addFood = new AddFoodItem("1", "Add Food");
		MenuItem viewItem = new ViewFoodItem("2", "View Food");
		MenuItem deleteFood = new DeleteFoodItem("3", "Delete Food");

		MenuItem addLog = new AddLogItem("1", "Add Log");
		MenuItem viewLogs = new ViewLogsItem("2", "View Logs");
		MenuItem deleteLog = new DeleteLog("3", "Delete Log");

		foodMenu.addItem(addFood);
		foodMenu.addItem(viewItem);
		foodMenu.addItem(deleteFood);
		foodMenu.setBackAction(backItem);
		foodMenu.addItem(backItem);

		foodLogMenu.addItem(addLog);
		foodLogMenu.addItem(viewLogs);
		foodLogMenu.addItem(deleteLog);
		foodLogMenu.setBackAction(backItem);
		foodLogMenu.addItem(backItem);

		mainMenu.addItem(foodMenu);
		mainMenu.addItem(foodLogMenu);
		mainMenu.setBackAction(backItem);
		mainMenu.addItem(backItem);

		mainMenu.doAction();
	}
}
