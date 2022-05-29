package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyReader {
	
	public String readProperty(String Key) throws Exception {
		FileInputStream file = new FileInputStream("src/test/resources/config.properties");
		Properties p = new Properties();
		p.load(file);
//		p.setProperty("without", "writing");
//		System.out.println(p.getProperty("without"));
		return p.getProperty(Key);
	}
	
	public void writeProperty(String Key, String Value) throws Exception {
		FileOutputStream file = new FileOutputStream("src/test/resources/config.properties",true);
		Properties p = new Properties();
		if(!p.containsKey(Key)) {
			p.setProperty(Key, Value);
			p.store(file, null);
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		PropertyReader p = new PropertyReader();
		System.out.println(p.readProperty("timeouts"));
		p.writeProperty("Test", "Devops University");
	}
}
