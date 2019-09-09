package app;

import actions.AddOption;
import actions.AddOrder;
import actions.AddUser;
import actions.DeleteOption;
import actions.DeleteOrder;
import actions.DeleteUser;
import actions.PayOrder;
import actions.ViewOptions;
import actions.ViewOrders;
import actions.ViewStatus;
import actions.ViewUsers;
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
		Menu mainMenu = menuGenerator();

		mainMenu.doAction();
	}

	private Menu menuGenerator() {
		Menu mainMenu = new Menu("", "");
		Menu usersMenu = new Menu("1", "Users");
		Menu optionsMenu = new Menu("2", "Options");
		Menu ordersMenu = new Menu("3", "Order");
		MenuItem backItem = new BackMenu("0", "Back");

		MenuItem addUser = new AddUser("3", "Add User");
		MenuItem viewUsers = new ViewUsers("2", "View Users");
		MenuItem deleteUser = new DeleteUser("1", "Delete User");

		MenuItem addOption = new AddOption("3", "Add Option");
		MenuItem viewOptions = new ViewOptions("2", "View Options");
		MenuItem deleteOption = new DeleteOption("1", "Delete option");

		MenuItem addOrder = new AddOrder("5", "Add order");
		MenuItem viewOrders = new ViewOrders("4", "View Orders");
		MenuItem payOrder = new PayOrder("3", "Pay order");
		MenuItem viewStatus = new ViewStatus("2", "View status");
		MenuItem deleteOrder = new DeleteOrder("1", "Delete order");

		usersMenu.addItem(addUser);
		usersMenu.addItem(viewUsers);
		usersMenu.addItem(deleteUser);
		usersMenu.addItem(backItem);
		usersMenu.setBackAction(backItem);

		optionsMenu.addItem(addOption);
		optionsMenu.addItem(viewOptions);
		optionsMenu.addItem(deleteOption);
		optionsMenu.addItem(backItem);
		optionsMenu.setBackAction(backItem);

		ordersMenu.addItem(addOrder);
		ordersMenu.addItem(viewOrders);
		ordersMenu.addItem(payOrder);
		ordersMenu.addItem(viewStatus);
		ordersMenu.addItem(deleteOrder);
		ordersMenu.addItem(backItem);
		ordersMenu.setBackAction(backItem);

		mainMenu.addItem(usersMenu);
		mainMenu.addItem(optionsMenu);
		mainMenu.addItem(ordersMenu);
		mainMenu.addItem(backItem);
		mainMenu.setBackAction(backItem);
		return mainMenu;
	}
}
