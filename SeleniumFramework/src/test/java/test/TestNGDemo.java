package test;

import org.testng.annotations.Test;

import Log4j.Log;
import config.PropertiesFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGDemo {

	WebDriver driver = null;
	public static String browserName = null;
	static Logger logger = LogManager.getLogger(Log.class);


	@BeforeTest
	public void setupTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",projectPath+"//drivers/geckodriver/geckodriver");
			driver = new FirefoxDriver ();
		}



		logger.info("Before Test");

		/* ---Sample script for desired capabilities/chrome options---

		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Pixel 2");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		driver = new ChromeDriver(chromeOptions);
		 */
	}

	@Test
	public void googleSearch() {

		driver.get("https://google.com");
		/*
		WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count=listOfInputElements.size();
		System.out.println("count is: "+ count);
		textBox.sendKeys("test");

		WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		searchButton.click();
		 */


	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("test completed successfully");

	}
}
