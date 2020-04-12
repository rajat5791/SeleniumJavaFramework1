 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class googleSearchPageObjects {
	
	WebDriver driver = null;
	
	
	//all the locators
	By textbox_search = By.xpath("//input[@name='q']");
	By button_search = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"); 
	
	//created constructor
	public googleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void openGoogle(){
		driver.get("https://google.com");
	}
	
	public void setTextInSearchBox(String text){
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearchButton(){
		driver.findElement(button_search).sendKeys(Keys.RETURN); 
	}
	

}
