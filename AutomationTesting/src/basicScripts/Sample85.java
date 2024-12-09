package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample85 {  
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize(); //WAS TO HANDLE HIDDEN DIVISION POP UP IN REDBUS-DATE(DATE POPUP WILL DISAPPER SO GO TO CHROME FREEZE PAGE THEN INSPECT AND GIVE XPATH)
	/*driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Date']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='21']")).click();*/
	
	
	
	driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0"); //WAS TO INSPECT HIDDEN DIVISION POP UP IN DEMOAPPS PAGE-UNDER POPUP-HIDDN DIVISN
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ssghh@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	

}
}
