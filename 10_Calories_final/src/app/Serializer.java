package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Database;

public class Serializer {
	private static final String DATABASE_FILE = "db15.ser";

	public Database load() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATABASE_FILE));

		Database result = (Database) ois.readObject();

		ois.close();

		return result;
	}

	public void save(Database db) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATABASE_FILE));

			oos.writeObject(db);

			oos.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error while saving file");
			e.printStackTrace();
		}
	}
}
