package sessions.session01.tema;

import java.io.File;
import java.io.IOException;

public class ClientCountLines {

		public static void main(String[] args) throws IOException {

			CountLines unFolder = new CountLines(args);
			System.out.println(unFolder);
		}
	}