package HelloWorld_Using_i18n;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * This class prints Hello World in English, French & German languages.
 * This is achieved using internationalization (i18n) feature from Java.
 * To tun the program successfully, all resource bundle files must be placed
 * under project folder and should not be part of any package.
 * */
public class HelloWorld_Using_i18n {
	
	public static void main(String[] args) {
		ResourceBundle enBundle = ResourceBundle.getBundle("MessageConstants");
		
		//France Bundle
		ResourceBundle frBundle = ResourceBundle.getBundle("MessageConstants", Locale.FRANCE);
		
		//German Bundle
		ResourceBundle deBundle = ResourceBundle.getBundle("MessageConstants", Locale.GERMANY);
		
		List<ResourceBundle> resourceBundles = new ArrayList<>();
		resourceBundles.add(enBundle);
		resourceBundles.add(frBundle);
		resourceBundles.add(deBundle);
		
		//verify messages printed in respective languages
		for (ResourceBundle resourceBundle : resourceBundles) {
			printMesagesInDifferentLanguages(resourceBundle);
		}
		
	}
	
	
	static void printMesagesInDifferentLanguages(ResourceBundle resBundle) {
		String key1 = "hello";
		String key2 = "world";
		
		System.out.println(resBundle.getString(key1) + ", " + resBundle.getString(key2));
	}

}
