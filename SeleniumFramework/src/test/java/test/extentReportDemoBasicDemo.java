 package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.googleSearchPage;


public class extentReportDemoBasicDemo {

	static WebDriver driver = null;
	public static void main(String[] args) {

		// start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google search Test One","Test to open google");
        
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"//drivers/chromedriver/chromedriver");
		driver = new ChromeDriver ();
		
		// log(Status, details)
        test1.log(Status.INFO, "Initiating test case");
		driver.get("https://google.com");
		test1.pass("Navigated to google");
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Test");
		test1.pass("Entered test keyword");
		
		
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).sendKeys(Keys.RETURN);;
		test1.fail("Pressed rerurned key");
		
		
		driver.close();
		test1.pass("Closed browser");
		
		test1.info("test completed successfully");
		
		// calling flush writes everything to the log file
        extent.flush();
	}

}
