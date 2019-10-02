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
			String userName = database.getUserName();
			System.out.println("Welcome " + userName + ".");
		} catch (FileNotFoundException e) {
			configureUserAccount();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private void configureUserAccount() {
		System.out.println("App configure... Set your user name.");
		String newUserName = keyboard.getString("Insert your user name.");
		database.addUserName(newUserName);
	}

}
