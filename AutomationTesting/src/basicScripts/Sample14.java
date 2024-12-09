package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample14 {
	public static void main(String[] args) //WAS to login to facebook using xpath locator
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sinchana");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sinchana23");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
