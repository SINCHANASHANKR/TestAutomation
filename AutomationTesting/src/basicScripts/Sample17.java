package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; //WAS to open shoppers stack and click on men and click on almonds
                                                  // Open shoppers stack click on mens sections, select6 almonds and click on buy now and enter un and pwd and login

public class Sample17 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='happilo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Buy Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		

	}

}
;