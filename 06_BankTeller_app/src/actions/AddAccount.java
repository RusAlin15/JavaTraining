package actions;

import app.ApplicationSession;
import app.Keyboard;
import menus.MenuItem;
import model.Account;
import model.Bank;
import model.Database;

public class AddAccount extends MenuItem {

	public AddAccount(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		String bankName = keyboard.getString("Insert Bank Name.");
		String accountName = keyboard.getString("Insert Account Name.");
		float accountAmount = Float.parseFloat(keyboard.getString("Insert account amount."));
		Bank bank = new Bank(bankName);
		Account account = new Account(accountName, bank, accountAmount);

		db.addAccount(account);
	}

}
