package sessions.session01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PersonClient {
	private static Person[] results;

	public static void main(String[] args) throws IOException {
		Person[] persons = { //
				new Person("Ion", 20, true), //
				new Person("Gheo", 21, false), //
				new Person("Maria", 20, false) //
		};
		save(persons);
		persons = load();
	}

	private static Person[] load() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
		setResults(new Person[3]);

		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}

			@SuppressWarnings("unused")
			String[] splits = s.split(",");

		}
		br.close();
		return null;
	}

	private static void save(Person[] persons) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File("Person.txt"));

		for (Person person : persons) {
			pw.println(person);
		}
		pw.close();
	}

	public static Person[] getResults() {
		return results;
	}

	public static void setResults(Person[] results) {
		PersonClient.results = results;
	}

}
