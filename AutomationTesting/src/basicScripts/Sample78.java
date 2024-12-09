package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; //amazon- buy now task

public class Sample78 {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);

	

}
}
