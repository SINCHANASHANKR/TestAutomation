package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample26 {   //WAS  tO swap manual and automation text field in dummy ManualAuto web page
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/ManualAuto.html");
		WebElement ele1 = driver.findElement(By.xpath("//input[@value='manual']"));
		WebElement ele3 = driver.findElement(By.xpath("//input[@value=' ']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@value='automation']"));
		Thread.sleep(2000);  
		ele1.sendKeys(Keys.CONTROL+"ax");
		ele3.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"ax");
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		ele3.sendKeys(Keys.CONTROL+"ax");
		ele2.sendKeys(Keys.CONTROL+"v");
		

}
}
