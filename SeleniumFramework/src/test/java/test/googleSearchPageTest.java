package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPageObjects;

public class googleSearchPageTest {
	
	private static WebDriver driver = null;
	public static void main (String[] args){
		googleSearchTest();
		
	}
	
	public static void googleSearchTest(){
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
		driver = new ChromeDriver ();
		
		
		//creating object of page class
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		
		//driver.get("https://google.com");
		searchPageObj.openGoogle();
		searchPageObj.setTextInSearchBox("demo");
		searchPageObj.clickSearchButton();
		//driver.close();
	}
	

}
