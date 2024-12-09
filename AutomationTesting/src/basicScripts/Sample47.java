package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample47 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Chiranjeevi Gowda/OneDrive/Attachments/FRAME3/mainpage1.html");
		Thread.sleep(2000);
		
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin1");
		
		Thread.sleep(2000);
		
	    driver.switchTo().frame("f1"); //ID
		//WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f1']"));
		//driver.switchTo().frame(f1);
	    WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("9876543211");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
	    driver.switchTo().frame("f2");
	    WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("admin@gmail.com");
		

}
}
