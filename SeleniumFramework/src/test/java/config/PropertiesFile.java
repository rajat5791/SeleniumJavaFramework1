package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNGDemo;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");   /* class variable as we are using it in more then
	one methode */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();	//output should be firefox
		setProperty();		//null output as it is just setter. although browser will change to chrome
		getProperties();	//output now should  be chrome
	}


	//getter methode
	public static void getProperties()
	{

		try {
			InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			try {
				prop.load(input);
				String browser = prop.getProperty("browser");
				System.out.println(browser);
				TestNGDemo.browserName = prop.getProperty("browser");
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		} 
	}

	public static void setProperty()
	{
		try {
			OutputStream output = new FileOutputStream(projectPath+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			try {
				prop.store(output,null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}


