package com.project.game.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItem {

	private List<MenuItem> items = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public Menu(String key, String option) {
		super(key, option);
	}
	
	public void addMenuItem(MenuItem item) {
		items.add(item);
	}

	@Override
	public void doAction() {
		while (true) {
			showMenu();
			
			System.out.println(">");
			String option =  scanner.nextLine();
			MenuItem item = getMenuItem(option);
			
			if(item == null) {
				System.out.println("Invalid option.");
				continue;
			}
			item.doAction();
		}
	}

	private MenuItem getMenuItem(String option) {
		for(MenuItem item : items) {
			if(item.getOption().equals(option)) {
				return item;
			}
		}
		return null;
	}

	private void showMenu() {
		for(MenuItem item : items) {
			System.out.println(item.toString());
		}
	}

}
