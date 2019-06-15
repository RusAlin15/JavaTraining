package com.project.game.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.game.actions.AddArmyUnitsAction;
import com.project.game.actions.AddPlayerAction;
import com.project.game.actions.RemoveArmyUnitsAction;
import com.project.game.actions.RemovePlayerAction;
import com.project.game.actions.SelectArmyUnitsAction;
import com.project.game.actions.SelectPlayerAction;
import com.project.game.actions.ViewArmyUnitsAction;
import com.project.game.actions.ViewPlayersAction;

public class Menu extends MenuItem {

	private List<MenuItem> items = new ArrayList<>();
	private MenuItem backAction;
	Scanner scanner = new Scanner(System.in);
	 
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
			System.out.print(">");
			String option = scanner.nextLine();
			MenuItem item = getMenuItemByOption(option);
			
			if (item == null) {
				System.out.println("Invalid option");
				continue;
			}
			
			if (item == backAction) {
				return;
			}
			
			item.doAction();
		}
	}

	private MenuItem getMenuItemByOption(String option) {
		for (MenuItem item : items) {
			if (item.getOption().equals(option)) {
				return item;
			}
		}
		return null;
	}
	
	private void showMenu() {
		for (MenuItem item : items) {
			System.out.println(item);
		}
	}

	public void setBackAction(MenuItem backAction) {
		this.backAction = backAction;
	}

	public void createMainMenu() {
		MenuItem viewPlayers = new ViewPlayersAction("9", "View Players");
		MenuItem selectPlayer = new SelectPlayerAction("8", "Select Player");
		MenuItem addPlayer = new AddPlayerAction("7", "Add Player");
		MenuItem removePlayer = new RemovePlayerAction("6", "Remove Player");
		BackMenu back = new BackMenu("0", "Exit");
		
		this.addMenuItem(viewPlayers);
		this.addMenuItem(selectPlayer);
		this.addMenuItem(addPlayer);
		this.addMenuItem(removePlayer);
		this.addMenuItem(back);
		this.setBackAction(back);		
	}

	public void createPlayerMenu() {
		MenuItem viewArmy = new ViewArmyUnitsAction("9", "View Army Unists");
		MenuItem addArmy = new SelectArmyUnitsAction("8", "Add Army Unit");
		MenuItem removeArmy = new AddArmyUnitsAction("7", "Remove Army Unit");
		MenuItem attackPlayer = new RemoveArmyUnitsAction("6", "Attack Player");
		BackMenu back = new BackMenu("0", "Back");
		  
		this.addMenuItem(viewArmy);
		this.addMenuItem(addArmy);
		this.addMenuItem(removeArmy);
		this.addMenuItem(attackPlayer);
		this.addMenuItem(back);
		this.setBackAction(back);		
	}

}
