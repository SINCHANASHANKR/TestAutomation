package basicScripts;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample91 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
   
    WebElement ele = driver.findElement(By.xpath("//button[text()='Start']"));     //FOR DEFAULT PAGE
    ele.click();
    
    WebDriverWait wait = new WebDriverWait(driver, 10);    
    WebElement ele1 = driver.findElement(By.xpath("//button[text()='Reset']"));
    wait.until(ExpectedConditions.visibilityOf(ele1));
    ele1.click();
    //wait.until(ExpectedConditions.visibilityOf(ele));
   // ele.click();
    
    
	/* driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");

	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    
	    WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));    // WITH ELEMENT PAGE
	    wait.until(ExpectedConditions.visibilityOf(ele));
	    ele.sendKeys("5");
	    
	   driver.findElement(By.xpath("//button[text()='Start']")).click();
	   
	   String Failed = "./Failed/";
	   Date d = new Date();
	   String d1 = d.toString();
	   String d2= d1.replaceAll(":", "-");
	   TakesScreenshot ts = (TakesScreenshot)driver;
	   
	   WebElement ele1 = driver.findElement(By.xpath("//select[@id='']"));
	   wait.until(ExpectedConditions.visibilityOf(ele1));
	   File src = ele1.getScreenshotAs(OutputType.FILE);
	   File dst = new File(Failed+d2+"ele1.jpeg");
	   FileHandler.copy(src, dst); */
	    
	    

}
}