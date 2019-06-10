package homework.session04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Menu  implements Localisation{

	@Override
	public void setLanguage(Language language) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMessage(String key) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("messages_en.txt"));
		System.out.println(prop.getProperty(key));
		System.out.println(prop.getProperty(key, "!/chlang1"));
		
	}

}
