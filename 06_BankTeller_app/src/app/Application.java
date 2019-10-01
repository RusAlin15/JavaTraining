package app;

import actions.AddAccount;
import actions.RemoveAccount;
import actions.SelectAccount;
import actions.ViewAccounts;
import menus.BackMenu;
import menus.Menu;
import menus.MenuItem;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		ApplicationSession.getInstance().init();
		app.run();
	}

	private void run() {
		Menu mainMenu = new Menu("", "");
		BackMenu back = new BackMenu("0", "Back");

		MenuItem addAccount = new AddAccount("1", "Add Account");
		MenuItem viewAccounts = new ViewAccounts("2", "View Accounts");
		MenuItem removeAccount = new RemoveAccount("3", "Remove Account");
		MenuItem selectAccount = new SelectAccount("4", "Select Account");

		mainMenu.addMenuItem(addAccount);
		mainMenu.addMenuItem(viewAccounts);
		mainMenu.addMenuItem(removeAccount);
		mainMenu.addMenuItem(selectAccount);
		mainMenu.addMenuItem(back);
		mainMenu.setBackAction(back);

		mainMenu.doAction();

	}
}
