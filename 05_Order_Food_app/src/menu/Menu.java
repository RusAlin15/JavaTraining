package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.InvalidOptionException;

public class Menu extends MenuItem {
	private List<MenuItem> items = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private MenuItem backAction;

	public Menu(String key, String option) {
		super(key, option);
	}

	@Override
	public void doAction() {
		while (true) {
			showMenu();
			System.out.print(">>");
			String key = scanner.nextLine();
			MenuItem item;
			try {
				item = getItemByKey(key);
			} catch (InvalidOptionException e) {
				System.out.println("Invalid option");
				continue;
			}

			if (item == backAction) {
				return;
			}
			item.doAction();
		}
	}

	private MenuItem getItemByKey(String key) throws InvalidOptionException {
		for (MenuItem item : items) {
			if (item.getKey().equals(key)) {
				return item;
			}
		}
		throw new InvalidOptionException();
	}

	private void showMenu() {
		System.out.println();
		for (MenuItem item : items) {
			System.out.println(item);
		}
	}

	public void addItem(MenuItem addUser) {
		items.add(addUser);
	}

	public void setBackAction(MenuItem backItem) {
		this.backAction = backItem;
	}

}
