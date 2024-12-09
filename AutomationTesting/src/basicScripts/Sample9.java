package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample9 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sinchana");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("sinchana23");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}


}
