package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1_GoogleSearch {

	
	/*public static void main(String[] args) {
		googleSearch();
	}*/
	
	@Test
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://google.com");
		WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		//List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		//int count=listOfInputElements.size();
		//System.out.println("count is: "+ count);
		textBox.sendKeys("test");
		
		WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		searchButton.click();
		driver.close();
	}
}
