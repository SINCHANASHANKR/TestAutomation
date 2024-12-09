package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample86 { //WAS TO HANDLE FILE UPLOAD POP UP IN DUMMY.UPLOAD PAGE AND DEMO APPS-POPUP-FILE UPLOADS-DEFAULT & CUSTOM
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	
	
	/*driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/UPLOAD%20FILE.HTML");   //dummy page -upload file
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.name("upload file"));
	Thread.sleep(2000);
	ele.sendKeys("C:\\Users\\Chiranjeevi Gowda\\OneDrive\\Desktop\\httplocalhost8080.txt\\");*/
	
	
	
	/*driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");    //demo apps-popups-default
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.id("fileInput"));
	Thread.sleep(2000);
	ele.sendKeys("C:\\Users\\Chiranjeevi Gowda\\OneDrive\\Desktop\\httplocalhost8080.txt\\");*/
	
	
	
	driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");  //demo apps-popups-default
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.id("customButton"));
	Thread.sleep(2000);
	ele.sendKeys("C:\\Users\\Chiranjeevi Gowda\\newman\\Restful-Booker-2024-11-08-14-16-53-574-0.html");
	
	
	
	

}
}
