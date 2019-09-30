package actions;

import app.ApplicationSession;
import app.Keyboard;
import menus.BackMenu;
import menus.Menu;
import menus.MenuItem;

public class SelectBankAction extends MenuItem {

	public SelectBankAction(String key, String option) {
		super(key, option);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		String bankName = keyboard.getString("Insert Bank Name :");

		Menu bankMenu = new Menu("", "");

		BackMenu back = new BackMenu("0", "Back");

		MenuItem addClient = new AddClientAction("1", "Add Client");
		MenuItem removeClient = new RemoveClientAction("2", "Remove Client");
		MenuItem viewClients = new ViewClientsAction("3", "View All Clients");
		MenuItem viewClientInfo = new ViewClientInfoAction("4", "View Client Info");

		bankMenu.addMenuItem(addClient);
		bankMenu.addMenuItem(removeClient);
		bankMenu.addMenuItem(viewClients);
		bankMenu.addMenuItem(viewClientInfo);
		bankMenu.addMenuItem(back);
		bankMenu.setBackAction(back);

		bankMenu.doAction();
	}

}
