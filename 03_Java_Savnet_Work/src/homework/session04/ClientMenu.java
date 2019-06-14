package homework.session04;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ClientMenu {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Menu meniu  = new Menu();
		
		meniu.getMessage("/message");
	}

}
