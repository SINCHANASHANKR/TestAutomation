package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; //WAS TO FETCH TEXT OF AN ELEMENT IN INSTAGRAM PAGE

public class Sample29 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//span[@class='_ab37']"));
	String text = ele.getText();
	System.out.println(text);
	Thread.sleep(2000);
	driver.quit();
		
	}
	
}
