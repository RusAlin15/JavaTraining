package com.project.game.app;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.project.game.model.Database;
import com.project.game.model.FileDatabase;
import com.project.game.model.Player;

public class ApplicationSession {
	private Keyboard keyboard = new Keyboard();
	private Database database = new FileDatabase();
	private Serializer serializer = new Serializer();
	private Player selectedPlayer;
	
	private static ApplicationSession instance = new ApplicationSession();
	
	public static ApplicationSession getInstance() {
		return instance;
	}

	public Keyboard getKeboard() {
		return keyboard;
	}

	public Database getDatabase() {
		return database;
	}

	public Serializer getSerializer() {
		return serializer;
	}
	
	public Player getSelectedPlayer() {
		return selectedPlayer;
	}
	
	public void setSelectedPlayer(String name) {
		selectedPlayer = ApplicationSession.getInstance().getDatabase().getPlayerByName(name);
	}
	
	public void init() {
		try {
			Database database = serializer.load();
			this.database = database;
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist. Continue...");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
	
