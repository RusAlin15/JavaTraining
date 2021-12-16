package sessions.session01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileThing {
	public static void main(String[] args) throws IOException {
		// writeFile();
		readFile();
	}

	private static void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
		int suma = 0;

		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}

			String[] splits = s.split(",");

			for (String splits1 : splits) {
				suma += Integer.parseInt(splits1);
			}
		}
		System.out.println(suma);

		br.close();
	}

	@SuppressWarnings("unused")
	private static void writeFile() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File("test.txt"));
		pw.close();
	}

}
