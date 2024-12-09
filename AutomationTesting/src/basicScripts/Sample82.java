package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample82 { //
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	
	WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
	WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
	WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
	WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
	WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blog']"));
	
	ArrayList<WebElement> l = new ArrayList<WebElement>();
	l.add(ele1);
	l.add(ele2);
	l.add(ele3);
	l.add(ele4);
	l.add(ele5);
	
	Robot r = new Robot();
	Actions act = new Actions(driver);
	
	for (WebElement we : l) 
	{
		act.contextClick(we).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
	}
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String> l1 = new ArrayList<String>(allwh);
	 Thread.sleep(2000);
	 
	 int count = l1.size();
	 System.out.println(count);
	 
	for(int i=count-1;i>=0;i--)
	{
	String browser = l1.get(i);                              //parent - 0index
	driver.switchTo().window(browser);                       //downloads-1
	}                                                    //documentation -2
	 
}
}
