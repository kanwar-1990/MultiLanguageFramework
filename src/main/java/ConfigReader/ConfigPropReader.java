package ConfigReader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {

	private Properties prop;
	private FileInputStream ip;

	/**
	 * intializing properties-- to read from the properties file will return
	 * properties class
	 * 
	 * @param Language
	 * @return
	 */

	public Properties initLangProp(String Language) {

		System.out.println("The Lang is :" + Language);
		
		

		prop = new Properties();
		try {

			switch (Language.toLowerCase()) {
			case "english":
				ip = new FileInputStream("./src/main/resources/resources/lang.eng.properties");
				break;
			case "french":
				ip = new FileInputStream("./src/main/resources/resources/lang.french.properties");
				break;
			case "russian":
				ip = new FileInputStream("./src/main/resources/resources/lang.rusian.properties");
				break;

			default:
				System.out.println("Please update the correct language+ " + Language);
				break;

			}
			prop.load(ip); //load the  properties

		} catch (Exception e) {

		}

		return prop;
	}

}
