package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample83 {//WAS TO HANDLE ALERT & CONFIRMATION POP-UP
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	
	driver.findElement(By.name("cusid")).sendKeys("abcde");
	Thread.sleep(2000);
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept(); // to click ok
	//a.dismiss();//to click cancel
}
}

