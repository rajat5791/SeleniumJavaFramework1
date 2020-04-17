package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.googleSearchPageObjects;

public class SmokeTest2 {
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
	
	
	@Given("Open browser and go to google.com")
	public void open_browser_and_go_to_google_com() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
		driver = new ChromeDriver ();
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		
		searchPageObj.openGoogle();
		
	}

	@When("I enter some {string} in serach box.")
	public void i_enter_some_keyword_in_serach_box(String testWord) {
		
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		searchPageObj.setTextInSearchBox(testWord);
		
	}

	@Then("I validate the outcomes of search.")
	public void i_validate_the_outcomes_of_search() {
		googleSearchPageObjects searchPageObj = new googleSearchPageObjects(driver);
		searchPageObj.clickSearchButton();
		driver.close();
		
	   
	}

}
