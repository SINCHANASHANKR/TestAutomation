package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample90 { //WAS to handle SYNCHRONIZATION OF VISIBILITY OF ELEMENTS/TITLE CONTAINS/URL CONTAINS. USING EXPLICIT WAIT
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
    String title= driver.getTitle();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    //wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));//title
    
    
  // WebElement ele = driver.findElement(By.id("email")); //element
   // wait.until(ExpectedConditions.visibilityOf(ele));
    
    wait.until(ExpectedConditions.urlContains("facebook")); //url
    
    
    driver.findElement(By.id("email")).sendKeys("admin");
}
}
