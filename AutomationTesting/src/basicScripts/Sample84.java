package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample84 { //WAS TO OPEN DEMO APPS -POPUPS-JAVASCRIPT- HANDLE ALL 3 POPUPS
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
	Thread.sleep(2000);
	
	driver.findElement(By.id("buttonAlert2")).click();//1
	Thread.sleep(2000);
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	
	driver.findElement(By.xpath("//a[text()='Confirm']")).click();//2
	Thread.sleep(2000);
	driver.findElement(By.id("buttonAlert5")).click();
	Thread.sleep(2000);
	Alert a1 = driver.switchTo().alert();
	System.out.println(a1.getText());
	a1.dismiss();
	
	driver.findElement(By.xpath("//a[text()='Prompt']")).click();//3
	Thread.sleep(2000);
	driver.findElement(By.id("buttonAlert1")).click();
	Thread.sleep(2000);
	Alert a2 = driver.switchTo().alert();
	System.out.println(a2.getText());
	a2.sendKeys("yes");
	Thread.sleep(2000);
	a2.accept();

}
}
