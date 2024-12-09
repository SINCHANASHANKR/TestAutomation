package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample28 { //was TO PASS DATA INTO 5 TXT FLDS USING SEDKEYS AND CLEAR FROM REVERSE ORDER USING kEYS IN 5textfld dummy page
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/5textfields.html");
		 WebElement ele1 = driver.findElement(By.id("a1"));
		 WebElement ele2 = driver.findElement(By.id("a2"));
		 WebElement ele3 = driver.findElement(By.id("a3"));
		 WebElement ele4 = driver.findElement(By.id("a4"));
		 WebElement ele5 = driver.findElement(By.id("a5"));
		 
		ele1.sendKeys("ONE");
		Thread.sleep(2000);
		ele2.sendKeys("TWO");
		Thread.sleep(2000);
		ele3.sendKeys("THREE");
		Thread.sleep(2000);
		ele4.sendKeys("FOUR");
		Thread.sleep(2000);
		ele5.sendKeys("FIVE");
		
		Thread.sleep(2000);
		ele5.sendKeys(Keys.CONTROL+"A");
		ele5.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		ele4.sendKeys(Keys.CONTROL+"A");
		ele4.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		ele3.sendKeys(Keys.CONTROL+"A");
		ele3.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"A");
		ele2.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"A");
		ele1.sendKeys(Keys.DELETE);
		

}
}
