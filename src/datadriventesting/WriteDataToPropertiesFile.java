package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./datadriven/data.properties");
		Properties property = new Properties();
		property.load(fis);
		
		//write data to properties object
		property.put("Key", "value");
		
		//save data to properties object
        
		FileOutputStream fos = new FileOutputStream("./datadriven/data.properties");
		property.store(fos, "Update properties file successfully");
	}

}
