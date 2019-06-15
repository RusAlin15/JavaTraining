package com.project.game.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.xml.crypto.Data;

import com.project.game.model.Database;
import com.project.game.model.FileDatabase;
import com.project.game.model.Player;

public class ApplicationSession {
	private Keyboard keboard  = new Keyboard();
	private Database database = new FileDatabase();
	private Serializer serializer = new Serializer();
	
	private static ApplicationSession instance = new ApplicationSession();
	
	public static ApplicationSession getInstance() {
		return instance;
	}

	public Keyboard getKeboard() {
		return keboard;
	}

	public Database getDatabase() {
		return database;
	}

	public Serializer getSerializer() {
		return serializer;
	}

	public void init() {
		Database database;

		try {
			database = serializer.load();
			this.database = database;
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}
	
	
}
