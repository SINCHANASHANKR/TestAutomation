package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample20 {

		public static void main(String[] args) throws InterruptedException // WAS to navigate to demoapps of qspiders
		                                                                   //pass data into textfield & to click on button tab and click on yes,
		                                                                   // to click on any one of the link in link tab, to click on radio button in radiobutton tab, to click on checkbox, to click o n toggle button
		{
			{
				System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://demoapps.qspiders.com/ui?scenario=1");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id= 'name']")).sendKeys("sinchana");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[.= 'Button']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[.= 'Yes' and @id='btn']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[.= 'Link']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[.= 'Contact Us']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[.= 'Radio Button']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id= 'attended']")).click();
				Thread.sleep(2000);
	
				driver.findElement(By.xpath("//section[.='Check Box']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='domain1']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[.='Toggle']")).click(); // toggle is not working
				Thread.sleep(2000);
			 WebElement ele = driver.findElement(By.xpath("//input[@id='toggler']"));
			 ele.sendKeys(Keys.ENTER);
				
				
				
	}

		}
}
