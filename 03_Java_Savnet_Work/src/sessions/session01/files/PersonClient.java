package sessions.session01.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class PersonClient {
	public static void main(String[] args) throws IOException {
		Person[] persons = { //
				new Person("Ion", 20, true), //
				new Person("Gheo", 21, false), //
				new Person("Maria", 20, true) //
		};
		save(persons);
		Person[] result = load();
		System.out.println(Arrays.toString(result));

	}

	private static Person[] load() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("persoane.txt")));

		Person[] result = new Person[3];
		int counter = 0;
		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}

			// aici transformam un String din fisier in Person
			Person person = new Person(s);
			result[counter] = person;
			counter++;
		}

		br.close();
		return result;
	}

	private static void save(Person[] persons) throws FileNotFoundException {
		// aici scrieti cod prima data
		PrintWriter pw = new PrintWriter(new File("persoane.txt"));

		for (Person person : persons) {
			pw.println(person.toFileFormat());
		}

		pw.close();
	}

}
