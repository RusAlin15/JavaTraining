package homework.session04;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Localisation {
	void setLanguage(Language language);

	void getMessage(String key) throws FileNotFoundException, IOException;
}
