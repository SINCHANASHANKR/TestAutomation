package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample45 {// was to handle and pass data into nested frame in FRAME1 html dummy page
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/FRAME1/mainpage1.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//INPUT[@TYPE='TEXT']")).sendKeys("admin");
		Thread.sleep(2000);
		
		//driver.switchTo().frame(0); //INDEX
		
		//driver.switchTo().frame("F1"); //ID
		
		WebElement f1 = driver.findElement(By.xpath("//IFRAME[@ID='F1']"));
		driver.switchTo().frame(f1);
		
		driver.findElement(By.xpath("//INPUT[@TYPE='TEXT']")).sendKeys("admin@123");
	}

}
