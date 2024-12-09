package basicScripts;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample89 {
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
    driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
    
    driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
    Set<String> allwh = driver.getWindowHandles();
    
       for (String wh : allwh) 
       {
    	   driver.switchTo().window(wh);
	}
       driver.findElement(By.id("email")).sendKeys("adbcm@gmail.com");
    }
}


