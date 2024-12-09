package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample27 //WAS to select the checkbox one by one and deselect in reverse order one by one by using keyboard in 5 checkbox dummy page
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/5checkbox.html");
		 WebElement ele1 = driver.findElement(By.id("a1"));
		 WebElement ele2 = driver.findElement(By.id("a2"));
		 WebElement ele3 = driver.findElement(By.id("a3"));
		 WebElement ele4 = driver.findElement(By.id("a4"));
		 WebElement ele5 = driver.findElement(By.id("a5"));
		 
		ele1.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ele2.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ele3.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ele4.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ele5.sendKeys(Keys.SPACE);
		
		Thread.sleep(2000);
		ele5.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ele4.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ele3.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ele2.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ele1.sendKeys(Keys.SPACE);
}
}