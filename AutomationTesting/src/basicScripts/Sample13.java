package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample13 
{
	public static void main(String []args)
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/demo5.html");
	driver.findElement(By.id("i1")).sendKeys("sinchana");
	driver.findElement(By.name("n1")).sendKeys("sinchana23");
	driver.findElement(By.className("c1")).sendKeys("sinchana23");
	driver.findElement(By.id("i1")).clear();
	driver.findElement(By.partialLinkText("instagram")).click();

}
}
