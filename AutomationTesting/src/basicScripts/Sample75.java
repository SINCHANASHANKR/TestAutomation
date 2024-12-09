package basicScripts;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample75 //WAS TO FETCH THE TITLE OF ALL THE BROWSERS AND CLOSE ONE BY ONE
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("NewWindow")).click();
	Set<String> allWh = driver.getWindowHandles();
	
	for(String wh : allWh)
	{
		driver.switchTo().window(wh);
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
	}
}
}
