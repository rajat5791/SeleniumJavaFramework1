/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest {
	
	WebDriver driver = null;
	@Given("Open browser and go to google.com")
	public void open_browser_and_go_to_google_com() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
		driver = new ChromeDriver ();
		driver.get("https://google.com");
	}

	@When("I enter some keyword in serach box.")
	public void i_enter_some_keyword_in_serach_box() {
		WebElement textBox = driver.findElement(By.xpath("//input[@name='q']"));
		textBox.sendKeys("test");
	    
	}

	@Then("I validate the outcomes of search.")
	public void i_validate_the_outcomes_of_search() {
		
		WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
		searchButton.click();
		driver.close();
	   
	}

}*/
