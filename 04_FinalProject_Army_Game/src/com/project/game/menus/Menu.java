package com.project.game.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItem {

	private List<MenuItem> items = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);
	private MenuItem backAction;
	
	public Menu(String option, String key) {
		super(option, key);
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
			

			if(item == backAction) {
				return;
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
	
	public void setBackActiom(MenuItem back) {
		this.backAction = back;
	}
	
	private void showMenu() {
		for(MenuItem item : items) {
			System.out.println(item.toString());
		}
	}

}
