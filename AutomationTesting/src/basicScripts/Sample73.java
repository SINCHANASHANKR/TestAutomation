package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample73 {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(1000);
	driver.findElement(By.id("login-button")).click();
	
	WebElement ele = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
	ele.click();
	
	WebElement ele1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	String title = ele1.getText();
	System.out.println(title);
	
WebElement ele2 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
	
	String price = ele2.getText();
	System.out.println(price);
	
	
}
	
}
