package app;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.Database;
import model.FileDatabase;

public class ApplicationSession {
	private Keyboard keyboard = new Keyboard();
	private Database database = new FileDatabase();
	private Serializer serializer = new Serializer();

	private static ApplicationSession instance = new ApplicationSession();

	public static ApplicationSession getInstance() {
		return instance;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Database getDatabase() {
		return database;
	}

	public Serializer getSerializer() {
		return serializer;
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
