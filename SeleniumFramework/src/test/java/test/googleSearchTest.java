package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googleSearchPage;
public class googleSearchTest {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
		driver = new ChromeDriver ();
		
		//go to google.com
		driver.get("https://google.com");
		WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		//List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		//int count=listOfInputElements.size();
		//System.out.println("count is: "+ count);
		
		googleSearchPage.textbox_search(driver).sendKeys("test" );
		
		googleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		textBox.sendKeys("test");
		
		WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		searchButton.click();
		driver.close();
	}
}
