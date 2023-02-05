package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataromPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./datadriven/data.properties");
		Properties property = new Properties();
		property.load(fis);
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		System.out.println(url+"\n"+username);
        
		int time = Integer.parseInt(property.getProperty("time"));
		//long time = Long.parseLong(property.getProperty("time"));
		System.out.println(time);

	}

}
