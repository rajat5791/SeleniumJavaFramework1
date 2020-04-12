import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[]args)
	{
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath: "+ projectPath);
		
		System.setProperty("webdriver.gecko.driver",projectPath+"//drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver ();
		//driver.get("https://selenium.dev/documentation/en/");
		
		
		//System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
		//WebDriver driver = new  ChromeDriver ();
		//driver.get("https://selenium.dev/documentation/en/");
		
		
		driver.get("https://google.com");
		//WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		//List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		//int count=listOfInputElements.size();
		//System.out.println("count is: "+ count);
		//textBox.sendKeys("test");
		driver.close();
	}
	
}
