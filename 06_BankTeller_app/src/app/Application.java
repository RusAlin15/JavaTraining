package app;

import actions.AddBankAction;
import actions.RemoveBankAction;
import actions.SelectBankAction;
import actions.ViewBanksAction;
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

		MenuItem addBank = new AddBankAction("1", "Add Bank");
		MenuItem removeBank = new RemoveBankAction("2", "Remove Bank");
		MenuItem viewBanks = new ViewBanksAction("3", "View All Banks");
		MenuItem selectBank = new SelectBankAction("4", "Select Bank");

		mainMenu.addMenuItem(addBank);
		mainMenu.addMenuItem(removeBank);
		mainMenu.addMenuItem(viewBanks);
		mainMenu.addMenuItem(selectBank);
		mainMenu.addMenuItem(back);
		mainMenu.setBackAction(back);

		mainMenu.doAction();

	}
}
