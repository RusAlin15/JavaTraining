package sessions.session01.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileThing {
	public static void main(String[] args) throws IOException {
		writeFile();
		readFile();
	}

	private static void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("output/test.txt")));

		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}

			System.out.println(s);
		}

		br.close();
	}

	private static void writeFile() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File("output/test.txt"));
		pw.println("qwe");
		pw.println("asd");
		pw.println("zxc");
		pw.close();
	}

}
